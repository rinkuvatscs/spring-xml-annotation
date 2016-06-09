package xml.spring.construtor.args;

public class MobileName {

	
	private String mobileName ;

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public MobileName(String mobileName) {
		super();
		this.mobileName = mobileName;
	}
	
	public MobileName() {
	}

	@Override
	public String toString() {
		return "MobileName [mobileName=" + mobileName + "]";
	}
	
	
}
