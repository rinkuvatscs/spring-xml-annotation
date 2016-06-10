package xml.spring.aop;

import org.springframework.beans.factory.BeanFactory;

import com.global.context.ContextLodaer;

public class AOPMainClass {

	public static final String METHOD_NAME = "display" ;
	public static void main(String[] args) {

		AdvisoryType advisoryType = AdvisoryType.AROUND;

		BeanFactory beanFactory = ContextLodaer.getBeanFactory();

		if (advisoryType.equals(AdvisoryType.BEFORE)) {
			System.out
					.println("=============Before Method Advisor Started ===============");
			beforeMethodAdvisor(beanFactory , METHOD_NAME);
			System.out
					.println("=============Before Method Advisor Ended ===============");
		}

		if (advisoryType.equals(AdvisoryType.AFTER)) {
			System.out
					.println("=============After Method Advisor Started ===============");
			afterMethodAdvisor(beanFactory , METHOD_NAME);
			System.out
					.println("=============After Method Advisor Ended ===============");
		}

		if (advisoryType.equals(AdvisoryType.AROUND)) {
			System.out
					.println("=============around Method Advisor Started ===============");
			aroundMethodAdvisor(beanFactory , METHOD_NAME);
			System.out
					.println("=============around Method Advisor Ended ===============");
		}

	}

	public static void beforeMethodAdvisor(BeanFactory beanFactory , String methodName) {

		A a = beanFactory.getBean("beforeProxy", A.class);
		if ("m".equalsIgnoreCase(methodName)) {
			a.m("Rinku", "Sharma");
		} else if ("display".equalsIgnoreCase(methodName)) {
			a.display("Rinku", "Sharma");
		}
	}

	public static void afterMethodAdvisor(BeanFactory beanFactory , String methodName) {

		A a = beanFactory.getBean("afterProxy", A.class);
		if ("m".equalsIgnoreCase(methodName)) {
			a.m("Rinku", "Sharma");
		} else if ("display".equalsIgnoreCase(methodName)) {
			a.display("Rinku", "Sharma");
		}
	}

	public static void aroundMethodAdvisor(BeanFactory beanFactory,
			String methodName) {

		A a = beanFactory.getBean("aroundProxy", A.class);
		if ("m".equalsIgnoreCase(methodName)) {
			a.m("Rinku", "Sharma");
		} else if ("display".equalsIgnoreCase(methodName)) {
			a.display("Rinku", "Sharma");
		}
	}

}

enum AdvisoryType {
	BEFORE, AFTER, AROUND
}
