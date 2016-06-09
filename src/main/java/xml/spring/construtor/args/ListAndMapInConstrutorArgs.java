package xml.spring.construtor.args;


public class ListAndMapInConstrutorArgs {

	
	public static void main(String[] args) {
		Employee employee =(Employee)ConstrutorArgsMain.getBeanFactory().getBean("employeListMapAsConstructorArgsForCustomObject");
		System.out.println(employee);
		
	}
}
