package xml.spring.inheriting.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InheritingMainClass {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e1 = (Employee) factory.getBean("e2");
		e1.show();
	}
}
