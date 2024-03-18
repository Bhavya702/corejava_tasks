package task1;

public class Trainee extends Employee{
	
	String skills;
	String certificates;

	public Trainee(int id, String name, int salary, String skills, String certificates,Adress adress) {
		super(id, name, salary,adress);
		this.skills = skills;
		this.certificates = certificates;
		
		
	}
	@Override
	public void printingDetails() {
		System.out.println("====================");
		 Adress ad=new Adress(3,"hebbal","banglore","karnataka","india");
		 Trainee e1=new Trainee(5, "sar", 9000,"java , c","java certified",ad); 
	         System.out.println("Trainee details :\nEmployee id ="+e1.getId()+"\nEmployee name ="+e1.getName()
	        +"\nEmployee salary ="+e1.getSalary()+"\nskill = "+e1.skills+"\ncertificates ="+e1.certificates);
	         System.out.println("Trainee adress details :\nnfloor no ="+ad.getFloorno()+"\nstreet ="+ad.getStreetname()
	        +"\ncity ="+ad.getCityname() +"\nstate ="+ad.getState()+"\ncountry ="+ad.getCountry());
	}
	}



