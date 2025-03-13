package exercise6;

public class Student extends Person implements Comparable<Student>{
	private int studentID;
	private double[] grades;
	private int index;
	// constructor
	public Student(String name, String surname, int age, int ID) {
		super(name, surname, age);
		this.studentID = ID;
		 index = 0;
		grades = new double[20];
	}
	
	//average
	public double calculateAverage() {
		double sum = 0;
		for(int i = 0; i < this.index; i++) {
			sum += this.grades[i];
		}
		return this.index == 0 ? 0 : sum / this.index;
	}
	
	public String display() {
		StringBuilder MSG = new StringBuilder();
		MSG.append("ID: "+this.studentID + "\n");
		MSG.append("name: "+this.getName() + "\n");
		MSG.append("surname: "+this.getSurname() + "\n");
		MSG.append("age: "+this.getAge() + "\n");
		MSG.append("Average: " + this.calculateAverage() +"\n\n");
		
		return MSG.toString();
	}
	public void addGrade(double grade) {
		this.grades[index++] = grade;
	}
	
	
	public String displayType() {
		StringBuilder MSG = new StringBuilder("Type of object: "+ this.getClass().getName() + "\n\n");
		return MSG.toString();
	}

	public int compareTo(Student student) {
		
		return  - Double.compare(this.calculateAverage(), student.calculateAverage());
		
	}

}
