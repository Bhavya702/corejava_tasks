												package task2;
												
	import java.util.Scanner;
												
     public class UserNameValidator2_task4 {    
	 public Boolean validate(String username) {
	 System.out.println("given username ="+username);
	 boolean b=true;
	 if(username.length()!=6) {
		 System.out.println("invalid username as it should contain length 6");
         System.out.println("please try again...!");
         b=false;									    		
	 }
	    else {										    
	    	for(int i=0;i<=username.length()-1;i++) {
	    	if(!(username.charAt(i)>='a'&&username.charAt(i)<='z'&&username.charAt(i)>=0||username.charAt(i)<=9))
	    			
	    			{
	    		System.out.println("invalid username as it should contain only small case letters or digits");
	    		System.out.println("please try again...!");
	    		b=false;
	    		break;										    	
	     }
	  }  
	 }
	return b;
  }
		public static void main(String[] args) {
		UserNameValidator2_task4 validator=new UserNameValidator2_task4();
		boolean result=validator.validate("bhavy0");
		System.out.println("validation result :"+result);
	 }
	}
										 	
												