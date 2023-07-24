package studentRegister;

public class registerModel {
	public class Student{
		int id;
		String name;
		static int cnt;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public static int getCnt() {
			return cnt;
		}
		
		Student(){
			cnt++;
			setId(cnt);
		}
	}
	public class Mark{
		int[] values = new int[5];	
		int student_id;

		static int cnt;
		
		public int[] getValues() {
			return values;
		}

		public void setValues(int[] values) {
			this.values = values;
		}
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
			
		Mark(int id){
			this.student_id = id;
			cnt++;
		}
	}
}
