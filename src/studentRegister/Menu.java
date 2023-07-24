package studentRegister;

import java.util.Scanner;

public class Menu {
	Menu(){
		Init();
	}
	public void Init() {
		int pom3 = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("What to do?: (CRUD/MEAN/CLOSE)");
		String to_do = scan.nextLine();
		while(pom3 != 0) {
			switch(to_do) {
			case "CRUD":
				CRUD();
				System.out.println("What to do?: (CRUD/MEAN/CLOSE)");
				to_do = scan.nextLine();
				break;
			case "MEAN":
				gradeMean();
				System.out.println("What to do?: (CRUD/MEAN/CLOSE)");
				to_do = scan.nextLine();
				break;
			case "CLOSE":
				pom3 = 0;
				break;
			}
		}
	}
	public void CRUD() {
		int pom2 = 1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("What to do?: (S - students, M - marks, END)");
		String to_do1 = scan1.nextLine();
		
		registerController regC = new registerController();
		while(pom2 != 0) {
			switch(to_do1) {
			case "S":
				regC.studentController();
				System.out.println("What to do?: (S - students, M - marks, END)");
				to_do1 = scan1.nextLine();
				break;
			case "M":
				regC.marksController();
				System.out.println("What to do?: (S - students, M - marks, END)");
				to_do1 = scan1.nextLine();
				break;
			case "END":
				pom2 = 0;
				break;
			}
		}	
	}
	public void gradeMean() {
		registerService regS = new registerService();
		regS.gradeMeanService();
	}
}
