package xml.spring.construtor.args;

import java.util.List;
import java.util.Map;

public class Employee {

	List<String> mobileList = null ;
	
	List<MobileName> mobileNameList = null ;
	
	private Map<String,String> contactMap;  
	
	
	public Map<String, String> getContactMap() {
		return contactMap;
	}


	public void setContactMap(Map<String, String> contactMap) {
		this.contactMap = contactMap;
	}


	public Employee(Address address) {
		super();
		this.address = address;
	}
	
	
	/*public Employee(List<String> mobileList) {
		super();
		this.mobileList = mobileList;
	}
*/
	
	public Employee(List<MobileName> mobileNameList) {
		super();
		this.mobileNameList = mobileNameList;
	}

	public Employee() {
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + " , mobileList ="+mobileList+" , mobileNameList ="+mobileNameList+" , ContactMap ="+contactMap+" ]";
	}

}
