package exercise6;



public abstract class Person {
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String display() {
		StringBuilder MSG = new StringBuilder();
		MSG.append("Name: "+this.name + "\n");
		MSG.append("Surname: "+this.surname + "\n");
		MSG.append("age: "+this.age + "\n\n");
		
		return MSG.toString();
	}
	
	public abstract String displayType();
}
