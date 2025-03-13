package exercise6;
import java.util.Arrays;
import java.util.Scanner;


public class mainApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Person[] people = new Person[5];
		String name, surname;
		int age, ID, ssn, curIndex = 0;
		
		for(int i = 0; i < 2; i++) {
			System.out.println("enter name of the teacher: ");
			name = scan.nextLine();
			System.out.println("enter surname of the teacher: ");
			surname = scan.nextLine();
			System.out.println("enter age of the teacher: ");
			age = scan.nextInt();
			System.out.println("enter social security number of the teacher: ");
			ssn = scan.nextInt();
			scan.nextLine();
			// then we can add some modules later here
			
			people[curIndex++] = new Teacher(name, surname,age,ssn);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("enter ID of the student: ");
			ID = scan.nextInt();
			scan.nextLine();
			System.out.println("enter name of the student: ");
			name = scan.nextLine();
			System.out.println("enter surname of the student: ");
			surname = scan.nextLine();
			System.out.println("enter age of the student: ");
			age = scan.nextInt();

			// then we can add some grades later here
			
			people[curIndex++] = new Student(name, surname,age,ID);
		}
		String MSG;
		for(int i = 0; i < curIndex; i++) {
			MSG = people[i].display();
			System.out.println(MSG);
			System.out.println(people[i].displayType());
		}
		Teacher[] teachers = new Teacher[3];
		
		teachers[0] = new Teacher("Ali", "Saleh",37,1111);
		teachers[0].addModule("Maths");
		teachers[0].addModule("Physics");
		teachers[1] = new Teacher("Mohamed", "Allaoui",40,1211);
		teachers[1].addModule("Arabic");
		teachers[1].addModule("French");
		teachers[2] = new Teacher("Salim", "Karaoui",44,1115);
		teachers[2].addModule("Music");
		teachers[2].addModule("Sport");
		Arrays.sort(teachers);
		
		for(Teacher T: teachers) {
			System.out.println(T.display());
		}
		
		Student[] students = new Student[3];
		
		students[0] = new Student("Ali", "Saleh",17,1111);
		students[0].addGrade(17.25);
		students[0].addGrade(18);
		students[1] = new Student("Mohamed", "Allaoui",17,1211);
		students[1].addGrade(15.75);
		students[1].addGrade(16.25);
		students[2] = new Student("Salim", "Karaoui",18,1115);
		students[2].addGrade(18.75);
		students[2].addGrade(15);
		
		Arrays.sort(students);
		
		for(Student S: students) {
			System.out.println(S.display());
		}
		// create two arrays, then use sort on them
		scan.close();
	}

}
