package javaMethods;

public class SetGetMethod {
	
	private int id;
	private String name;
	
	//take set method to set value for employee name
	public void setName(String name)
	{
		this.name= name;
	}
	
	//create a get method to get employee name
	public String getName()
	{
		return this.name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return this.id;
	}
}
