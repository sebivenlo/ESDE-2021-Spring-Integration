import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class RunTask2 extends AbstractRunner {

	public static void main(String[] args) {
		run("task2.xml");
	}

}