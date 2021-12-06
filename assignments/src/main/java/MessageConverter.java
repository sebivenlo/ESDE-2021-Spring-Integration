import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.integration.mqtt.support.MqttMessageConverter;
import org.springframework.integration.support.AbstractIntegrationMessageBuilder;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class MessageConverter implements MqttMessageConverter {

    @Override
    public AbstractIntegrationMessageBuilder<?> toMessageBuilder(String topic, MqttMessage mqttMessage) {
        try {
            return MessageBuilder.withPayload(Integer.valueOf(mqttMessage.toString()));
        } catch (NumberFormatException ex) {
            return MessageBuilder.withPayload(mqttMessage.toString());
        }
    }

    @Override
    public Object fromMessage(Message<?> message, Class<?> targetClass) {
        return null;
    }

    @Override
    public Message<?> toMessage(Object payload, MessageHeaders headers) {
        return null;
    }
}
