package def ;

public class Son1 extends Dad {
	

	
	public Son1() {
		super();
		
	}

	public Son1(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		return "Son1 [Name = " + getName() + ", Age = " + getAge()+"]";
	}

	

}
