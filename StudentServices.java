import java.util.Scanner;

public class StudentServices {
	
	Student studentsList[] = new Student[5]; 
	int index = 0;
	int studentId = 1000001;
	Scanner scan = new Scanner(System.in);
	
	public void addNewStudent() {
		if(index<5) {
			Student s = new Student();
			System.out.println("Enter Student Name ...");
			String name = scan.next();
			System.out.println("Enter Student Email Id ");
			String email = scan.next();
			System.out.println("Enter Student Phone Number ");
			long phone = scan.nextLong();
			s.setStudentDetails(studentId,name,email,phone);
			studentsList[index] = s;
			index = index + 1;
			studentId = studentId + 1;
			System.out.println("Student details got added successfully");
		}
		else {
			System.out.println("Sorry!.. Admissions got filled.");
			System.out.println("Better Luck Next time.....(..)");
		}
	}
	
	public void displayAllStudents() {
		if(index==0) {
			System.out.println("No student has been admitted till now....");
		}
		else {
			for(int i=0;i<index;i++) {
				Student s = studentsList[i];
				System.out.println(s);
			}
		}
	}
	
	public void menu() {
		StudentServices service = new StudentServices();
		while(true) {
			System.out.println("=============Welcome to SMS=========");
			System.out.println("Press 1 for Add New Student");
			System.out.println("Press 2 for Display All Available Students");
			System.out.println("Press 9 for Exit");
			System.out.println("Please Choose your Choice..");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : service.addNewStudent(); break;
			case 2 : service.displayAllStudents();break;
			case 9 : System.exit(choice);
			default:System.out.println("Press Enter to go to the previous menu..");
					scan.next();
			}
		}
	}
}
