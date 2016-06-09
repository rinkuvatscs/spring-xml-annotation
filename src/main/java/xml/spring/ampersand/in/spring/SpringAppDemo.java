package xml.spring.ampersand.in.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDemo {

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		
		// with ampersand
		FactoryBean factoryBean = (FactoryBean) context.getBean("&customfb");
		MyBean myBean = (MyBean) factoryBean.getObject();
		myBean.doTask();
		
		
		// without ampersand
		CustomFactoryBean customFactoryBean = context.getBean(CustomFactoryBean.class);
		MyBean mybean = customFactoryBean.getObject();
		mybean.doTask();
		
		

	}
}
