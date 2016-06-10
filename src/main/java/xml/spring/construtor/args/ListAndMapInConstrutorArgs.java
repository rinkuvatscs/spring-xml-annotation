package xml.spring.construtor.args;

import com.global.context.ContextLodaer;


public class ListAndMapInConstrutorArgs {

	
	public static void main(String[] args) {
		Employee employee =(Employee)ContextLodaer.getBeanFactory().getBean("employeListMapAsConstructorArgsForCustomObject");
		System.out.println(employee);
		
	}
}
