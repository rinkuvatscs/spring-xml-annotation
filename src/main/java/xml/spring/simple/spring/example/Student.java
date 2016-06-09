package xml.spring.simple.spring.example;

public class Student {
	private String name ;

	public String getName() {
		return name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student() {
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo(){  
	    System.out.println("Hello: "+name);  
	}  
}
