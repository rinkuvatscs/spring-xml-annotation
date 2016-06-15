package annotation.spring.aop.with.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMainClass {

	public static void main(String[] args) {
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
	       
		  Operation e = (Operation) context.getBean("operation");  
	      
		  System.out.println("calling msg...");  
	        e.msg();  
	        System.out.println("calling m...");  
	        e.m();  
	        System.out.println("calling k...");  
	        e.k();  
	        
	}
}
