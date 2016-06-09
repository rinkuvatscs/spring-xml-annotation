package xml.spring.simple.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class MainClass {

	public static void main(String[] args) {
		usingXmlBeanFactory();
	}
	
	public static void usingXmlBeanFactory() {
		System.out.println("XmlBeanFactory Demo Started");
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		beanFactory.getBean(Student.class).displayInfo();
		//System.out.println("XmlBeanFactory Demo Ended");
	}
}
