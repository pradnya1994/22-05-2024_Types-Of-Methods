package javaMethods;

public class TestEmployee {

	public static void main(String[] args) {
		
		SetGetMethod employee = new SetGetMethod();
		employee.setId(2029);
		employee.setName("abc xyz");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		
	}

}
