package studentRegister;

import java.util.ArrayList;
import java.util.Scanner;

import studentRegister.registerModel.Mark;
import studentRegister.registerModel.Student;

public class registerController {
	ArrayList<Student> students = new ArrayList<>();
	ArrayList<Mark> marks = new ArrayList<>();
	int[] markvalues = new int[5];
	public void studentController() {
		int pom = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("What to do?: (C/R/U/D/END)");
		String user_to_do = scan.nextLine();
		
		while(pom != 0) {
			switch (user_to_do) {
			case "C":
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Name: ");
				registerModel model = new registerModel();
				registerModel.Student s1 = model.new Student();
				s1.setName(scan1.nextLine());
				students.add(s1);
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan.nextLine();
				break;
			case "R":
				for(Student element : students)
					System.out.println(element.getId() + " " + element.getName());
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan.nextLine();
				break;
			case "U":
				Scanner scan2 = new Scanner(System.in);
				Scanner scan3 = new Scanner(System.in);
				System.out.println("ID to update: ");
				int id_update = scan2.nextInt();
				for(Student element : students)
					if(element.getId() == id_update) {
						System.out.println("Updated name: ");
						element.setName(scan3.nextLine());
					}
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan.nextLine();	
				break;
			case "D":
				Scanner scan4 = new Scanner(System.in);
				System.out.println("ID to delete: ");
				int id_delete = scan4.nextInt();
				for(Student element : students)
					if(element.getId() == id_delete) {
						students.remove(element);
						for(Student next_el : students)
							if(next_el.getId() > id_delete) {
								next_el.setId(next_el.getId() - 1);
								Student.cnt--;
							}
					}
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan.nextLine();	
				break;
			case "END":
				pom = 0;
				break;
			}	
		}
	}
	public void marksController() {
		int pom1 = 1;
		Scanner scan5 = new Scanner(System.in);
		System.out.println("What to do?: (C/R/U/D/END)");
		String user_to_do = scan5.nextLine();
		
		while(pom1 != 0) {
			switch (user_to_do) {
			case "C":
				Scanner scan6 = new Scanner(System.in);
				Scanner scan7 = new Scanner(System.in);
				System.out.println("ID to add mark: ");
				int id_stud = scan6.nextInt();
				registerModel model1 = new registerModel();
				registerModel.Mark m1 = model1.new Mark(id_stud);
				for(int i=0;i<5;i++) {
					System.out.println("Add mark: ");
					markvalues[i] = scan7.nextInt();
				}
				m1.setValues(markvalues);
				marks.add(m1);
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan5.nextLine();
				break;
			case "R":
				Scanner scan8 = new Scanner(System.in);
				System.out.println("ID to read marks: ");
				int id_stud1 = scan8.nextInt();
				for(Mark element : marks)
					if(element.student_id == id_stud1) {
						System.out.println(element.getStudent_id() + " marks: " + element.getValues());
					}
					
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan5.nextLine();
				break;
			case "U":
				Scanner scan9 = new Scanner(System.in);
				Scanner scan10 = new Scanner(System.in);
				System.out.println("ID to update: ");
				int id_update1 = scan9.nextInt();
				for(Student element : students)
					if(element.getId() == id_update1) {
						registerModel model2 = new registerModel();
						registerModel.Mark m2 = model2.new Mark(id_update1);
						for(Mark ele : marks){
							if(ele.student_id == id_update1) {
								for(int i=0;i<5;i++) {
									System.out.println("Update marks: ");
									markvalues[i] = scan10.nextInt();
								}
								m2.setValues(markvalues);
							}
						}		
					}
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan5.nextLine();	
				break;
			case "D":
				Scanner scan11 = new Scanner(System.in);
				System.out.println("ID to delete: ");
				int id_delete1 = scan11.nextInt();
				for(Student element : students)
					if(element.getId() == id_delete1) {
						registerModel model3 = new registerModel();
						registerModel.Mark m3 = model3.new Mark(id_delete1);
						for(Mark ele : marks){
							if(ele.student_id == id_delete1) {
								marks.remove(ele);
								}
							}		
						for(Mark nextele : marks)
							if(nextele.getStudent_id() > id_delete1) {
								nextele.setStudent_id(nextele.getStudent_id() - 1);
								Mark.cnt--;
							}
					}
				System.out.println("What to do?: (C/R/U/D/END)");
				user_to_do = scan5.nextLine();	
				break;
			case "END":
				pom1 = 0;
				break;
			}		
		}
	}
}
