import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class RunTestMQTT extends AbstractRunner {

	public static void main(String[] args) {
		run("test-mqtt.xml");
	}

}