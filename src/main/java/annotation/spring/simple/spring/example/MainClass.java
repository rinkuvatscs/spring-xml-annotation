package annotation.spring.simple.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainClass {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		usingAnnotationBeanFactory();
	}

	public static void usingAnnotationBeanFactory() {
		System.out.println("XmlBeanFactory Demo Started");
		applicationContext = new AnnotationConfigApplicationContext(
				MainClass.class);
		((Student) applicationContext.getBean(Student.class)).displayInfo();
	}

	
	@Bean(name="studentBean")
	public Student getStudent() {
		Student student = new Student();
		student.setName("Rinku Sharma");
		return student ;
	}
}
