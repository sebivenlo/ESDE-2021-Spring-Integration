import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class RunFilterExample extends AbstractRunner {

	public static void main(String[] args) {
		run("filter-example.xml");
	}

}