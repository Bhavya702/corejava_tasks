package task1;

public class MainClass {
	
		public static void main(String[] args) {
			Employee e1=new Employee(1,"a",15000);
			Adress ad=new Adress(2,"j","l","o","r");
			e1.printingDetails();
			SoftwareEngineer e2=new SoftwareEngineer(3, "lal", 700, "java",ad);
			e2.printingDetails();
			Trainee t2=new Trainee(2,"lal",40000, "java", "java", ad);
			t2.printingDetails();
			System.out.println(3/7);
		}
	

		

}
