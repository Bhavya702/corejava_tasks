package task1;

public class JuniorEngineer extends Employee {
	
	 static int assessment;
	 static String feedback;
	public JuniorEngineer(int id, String name, int salary, int assessment, String feedback,Adress adress) {
		super(id, name, salary,adress);
		this.assessment = assessment;
		this.feedback = feedback;
	}
	public int getAssessment() {
		return assessment;
	}
	public void setAssessment(int assessment) {
		this.assessment = assessment;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

			
	}








