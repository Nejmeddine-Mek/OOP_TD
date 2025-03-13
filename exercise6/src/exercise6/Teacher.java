package exercise6;

public class Teacher extends Person implements Comparable<Teacher>{
	private long ssn;
	private String[] modules;
	private int index = 0;
	
	public Teacher(String name, String surname, int age, long ssn) {
		super(name, surname,age);
		this.ssn = ssn;
		modules = new String[15];
	}
	
	public void addModule(String module) {
		this.modules[index++] = module;
	}
	
	
	public String display() {
		
		StringBuilder MSG = new StringBuilder();
		MSG.append("name: " + this.getName() + "\n");
		MSG.append("Surname: "+ this.getSurname() + "\n");
		MSG.append("age: " + this.getAge() + "\n");
		MSG.append("socail security number: " + this.ssn + "\n");
		MSG.append("Modules: ");
		for(int i = 0; i < index; i++) {
			MSG.append(modules[i] + " ");
		}
		MSG.append("\n\n");
		
		return MSG.toString();
	}
	
	public String displayType() {
		StringBuilder MSG = new StringBuilder("Type of object: "+ this.getClass().getName());
		return MSG.toString();
	}

	@Override
	public int compareTo(Teacher teacher) {
		
		return this.getName().compareTo(teacher.getName()) + this.getSurname().compareTo(teacher.getSurname());
	}

	
}
