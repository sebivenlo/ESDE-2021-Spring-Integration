import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class RunTask3 extends AbstractRunner {

	public static void main(String[] args) {
		run("task3.xml");
	}

}