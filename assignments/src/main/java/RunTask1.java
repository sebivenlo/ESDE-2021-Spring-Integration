import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class RunTask1 extends AbstractRunner {

	public static void main(String[] args) {
		run("task1.xml");
	}

}