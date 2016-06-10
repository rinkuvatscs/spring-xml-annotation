package com.global.context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ContextLodaer {

	static Resource resource = null ; 
	static BeanFactory beanFactory = null ;
	public static BeanFactory getBeanFactory() {
		return beanFactory;
	}


	public static void setBeanFactory(BeanFactory beanFactory) {
		ContextLodaer.beanFactory = beanFactory;
	}

	static{
		resource = new ClassPathResource("spring.xml");
		beanFactory = new XmlBeanFactory(resource);
	}
}
