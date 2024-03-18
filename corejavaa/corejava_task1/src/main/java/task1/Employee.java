
package task1;

public class Employee {
    	private int id;
		private String name;
		private int salary;
		private Adress adress;
		public Employee(int id, String name, int salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public Employee(int id, String name, int salary,Adress address) {	
       this(id,name,salary);
       this.adress=adress;
		}
		public Adress getAdress() {
			return adress;
		}
		
		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public int getSalary() {
			return salary;
		}
		
   public void printingDetails() 
   {
	   Adress ad=new Adress(1,"hills","hyd","telangana","india");
		Employee e1=new JuniorEngineer(5, "jar", 12000, 10, "good",ad); 
          System.out.println("juniorEnginer deatails :\nEmployee id ="+e1.getId()+"\nEmployee name ="+e1.getName()
         +"\nEmployee salary ="+e1.getSalary()+"\nasessment score ="+JuniorEngineer.assessment+"\n"
         		+ "feedback ="+JuniorEngineer.feedback);
          System.out.println("juniorEnginer adress details :\nnfloor no ="+ad.getFloorno()+"\nstreet ="+ad.getStreetname()
         +"\ncity ="+ad.getCityname() +"\nstate ="+ad.getState()+"\ncountry ="+ad.getCountry());
          
   }
}

	   
	   
//	   System.out.println("Employee details :");
//	   System.out.println("eid"+id);
//	   System.out.println("ename="+ name);
//	   System.out.println("esalary"+adress);
//	   System.out.println(JuniorEngineer.assessment);
//	   System.out.println(JuniorEngineer.feedback);
	   
   

