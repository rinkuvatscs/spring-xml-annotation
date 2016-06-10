package xml.spring.construtor.args;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.global.context.ContextLodaer;

import xml.spring.simple.spring.example.Student;

public class ConstrutorArgsMain {
	
	private static BeanFactory beanFactory = ContextLodaer.getBeanFactory();
	
	public static void main(String[] args) {
		usingXmlBeanFactory();
		usingConstrtorArgs();
	}


	/*
	 * 
	 * <bean id="studentbeanforconstrutor" class="xml.spring.simple.spring.example.Student">
	 * <constructor-arg value="Consturtor Args Rinku Sharma">
	 * </constructor-arg> </bean>
	 */
	
	public static void usingConstrtorArgs() {
		Employee employee = (Employee)beanFactory.getBean(Employee.class);
		System.out.println(employee);
	}
	
	public static void usingXmlBeanFactory() {
		System.out.println("XmlBeanFactory Demo Started");
		
		((Student)beanFactory.getBean("studentbeanforconstrutor")).displayInfo();
		//System.out.println("XmlBeanFactory Demo Ended");
	}
}
