package studentRegister;

import studentRegister.registerModel.Student;
import java.util.ArrayList;
import java.util.Scanner;
import studentRegister.registerModel.Mark;

public class registerService {
	public double gradeMeanService() {
		double sum = 0;
		registerController regCon = new registerController();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ID to calc mean: ");
		int id = scan.nextInt();
		
		for(Student element : regCon.students) {	
			if(id == element.getId()) {
				for(Mark ele : regCon.marks) {
					if(id == ele.getStudent_id()) {
						for(int i=0;i<5;i++) {
							sum += regCon.markvalues[i];
						}
						return (sum/5);
					}
				}
			}
		}
		return 0;
	}
}
