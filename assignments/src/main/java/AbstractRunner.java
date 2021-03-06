import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.mqtt.inbound.AbstractMqttMessageDrivenChannelAdapter;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

import java.util.Scanner;

public abstract class AbstractRunner {

    /* TODO 0
        - change the topic field below to a random topic name of your choice
        - right click the RunTestMQTT file in the project files tab on the left and click "Run RunTestMQTT.main()"
        - open http://www.hivemq.com/demos/websocket-client/ in your browser
        - click connect, enter the topic name you chose
        - send some message
        - check if they end up in your logs
     */
    private static final String topic = "testtopic/1";

    private static Log logger = LogFactory.getLog(RunTestMQTT.class);

    public static void run(String filepath) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(filepath, RunTestMQTT.class);

        AbstractMqttMessageDrivenChannelAdapter mqttInbound =
                context.getBean("mqttInbound", AbstractMqttMessageDrivenChannelAdapter.class);

        mqttInbound.removeTopic("default");
        mqttInbound.addTopic(topic);

        // As an alternative to the mqtt connection we can also read input from the console and send that as messages to the mqtt-messages channel
//        MessageChannel inputChannel = context.getBean("mqtt-messages", MessageChannel.class);
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Type something: ");
//            String line = scanner.nextLine();
//            inputChannel.send(new GenericMessage<String>(line));
//
//        }
    }
}
