package xml.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Object obj ;
		System.out.println("This is before method running ");
		obj = invocation.proceed();
		System.out.println("This is after method running ");
		return obj ;
	}
}
