class Person {
int id;
String name;
String gender;
String emailid;
long phno;

public Person(int id, String name, String gender, String emailid, long phno) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.emailid = emailid;
	this.phno = phno;
}
void eat() {
	System.out.println(name+"   is eating");
}
void sleep() {
	System.out.println(gender+" "+name+ "     is sleeping");
}
}
