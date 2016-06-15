package annotation.spring.aop.with.spring.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	
	@Pointcut("execution(* Operation.k*(..))")
	public void display() {
		
		System.out.println("Display Method started to run");
	
	}

	@Before("display()")
	public void myadvice(JoinPoint joinPoint) {
		System.out.println("My Method myadvice before Operation Method Execution");
	}
	
	
	@Pointcut("execution(* Operation.m*(..))")
	public void displayAfter() {
		System.out.println("After Display Method started to run");
	}
	@After("displayAfter()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("My Method myadvice After Operation Method Execution");
	}
}

