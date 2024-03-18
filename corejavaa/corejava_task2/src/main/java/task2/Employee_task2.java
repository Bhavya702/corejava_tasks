package task2;

public class Employee_task2 {
	String name;
	int yearofjoining;
	int salary;
	String address;
	public Employee_task2(String name, int yearofjoining, int salary, String address) {
		super();
		this.name = name;
		this.yearofjoining = yearofjoining;
		this.salary = salary;
		this.address = address;
	}
	
	
	public static void main(String[] args) {
		System.out.println("name"+"    "+"yearofjoining"+"     "+"salary"+"    "+"address");
		System.out.println();
		Employee_task2 e=new Employee_task2("seetha",2023,35000,"mpl");      
		System.out.println(e.name+"      "+e.yearofjoining+"          "+e.salary+"        "+e.address);
		System.out.println();
		Employee_task2 e1=new Employee_task2("ram",2024,25000,"bnglr");      
		System.out.println(e1.name+"         "+e1.yearofjoining+"          "+e1.salary+"        "+e1.address);
		System.out.println();
		Employee_task2 e2=new Employee_task2("lakshman",2022,45000,"hyd");      
		System.out.println(e2.name+"    "+e2.yearofjoining+"          "+e2.salary+"        "+e2.address);
	}
	

}
