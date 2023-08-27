public class Person1 {
	int id;
	String name;
	String gender;
	String email;
	long phone;
	
	public Person1(int id, String name, String gender, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	void eat()
	{
		System.out.println(this.name+" Is Eating.....");
	}
	
	void sleep()
	{
		System.out.println(gender+" "+name+" Is Sleeping");
	}
		
}

