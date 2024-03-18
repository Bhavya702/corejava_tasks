package task2;

import java.util.Scanner;

public class Movie_task3 {
	Scanner sc=new Scanner(System.in);
	
	String movieTitle;
	String director;
	int realeaseYear;
	String genre;
	int averageRating;
	public Movie_task3(String movieTitle, String director, int realeaseYear, String genre, int averageRating) {
		super();
		this.movieTitle = movieTitle;
		this.director = director;
		this.realeaseYear = realeaseYear;
		this.genre = genre;
		this.averageRating = averageRating;
	}
	public void updateAverageRating() {
		System.out.println("enter the rating");
		int newAverage=sc.nextInt();
		System.out.println("previous rating is :"+averageRating);
		int updatedAverage =newAverage+averageRating;
		System.out.println("updated average rating of the movie is :"+updatedAverage);
		
	}
	public void addReview() {
		String view="movie was too good and dont miss it..!";
		System.out.println("give the review for the movie..!");
		
		String review=sc.nextLine();
	String updatedreview=view+"\n"+review;
	System.out.println("previous review is :"+view);
		System.out.println("updatedreviews of movie  are :");
		System.out.println(updatedreview);
	}
   public 
 void movieDetails() {
	   Movie_task3 m3=new Movie_task3("kerintha","ravi",2015,"drama",10);
	   System.out.println("choose the options");
	 System.out.println("press 1 for movie deatails"+"\npress 2 for giving rating"+"\npress 3 for giving review");
    int choose=sc.nextInt();
        
	 if(choose==1) {
		 System.out.println("Movie name = "+m3.movieTitle);
		 System.out.println("Movie director = "+m3.director);
		 System.out.println("movie release year = "+m3.realeaseYear);
		 System.out.println("movie genre = "+m3.genre);
		 System.out.println("movie rating = "+m3.averageRating); 
	 }
	 if(choose==2) {
		 m3.updateAverageRating();
	 }
	 if(choose==3) {
		 m3.addReview();
	 }
   }
   public static void main(String[] args) {
	   Movie_task3 m3=new Movie_task3("kerintha","ravi",2015,"drama",10);

        m3.movieDetails();
}
}
