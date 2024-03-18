package task1;

public class SoftwareEngineer extends Employee{
	
		String project;
		public SoftwareEngineer(int id, String name, int salary, String project,Adress adress) {
			super(id, name, salary,adress);
			this.project = project;
		}
		
		@Override
		 public void printingDetails() {
			System.out.println("====================");
			 Adress ad=new Adress(1,"nagawara","bang","kar","india");
			 SoftwareEngineer e1=new SoftwareEngineer(5, "sar", 9000, "maven",ad); 
		          System.out.println("SoftwareEngineer details :\nEmployee id ="+e1.getId()+"\nEmployee name ="+e1.getName()
		         +"\nEmployee salary ="+e1.getSalary()+"project "+e1.project);
		          System.out.println("SoftwareEnginer adress details :\nnfloor no ="+ad.getFloorno()+"\nstreet ="+ad.getStreetname()
		         +"\ncity ="+ad.getCityname() +"\nstate ="+ad.getState()+"\ncountry ="+ad.getCountry());
			
		   
			
		
		
		

	}

}
