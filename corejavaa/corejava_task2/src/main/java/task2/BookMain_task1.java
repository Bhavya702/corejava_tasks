package task2;

public class BookMain_task1 {
	public static void main(String[] args) {
		Book_task1 b[]=new Book_task1[11];
		 b[1]=new Book_task1(1,"Atomation","don");
		 b[2]=new Book_task1(2,"c","mars");
		 b[3]=new Book_task1(3,"c#","sun");
		 b[4]=new Book_task1(4,"python","sat");
		 b[5]=new Book_task1(5,"java","moon");
		 b[6]=new Book_task1(6,"cloud","corg");
		 b[7]=new Book_task1(7,"java","jupiter");
		 b[8]=new Book_task1(8,"selenium","don");
		 b[9]=new Book_task1(9,"java","neph");
		 b[10]=new Book_task1(10,"testing","don");
		 System.out.println("10 records of book details :");
		for(int i=1;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
