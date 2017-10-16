//1. Instantiate some Movie objects (at least 5).
	//2. Use the Movie class to get the ticket price of one of your movies.

	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 

public class NetflixRunner {
public static void main(String[] args) {
	
	Movie m1 = new Movie("Hunger Games", 5);
	Movie m2 = new Movie("Frozen", 2);
	Movie m3 = new Movie("IT", 3);
	Movie m4 = new Movie("The Little Mermaid", 1);
	Movie m5 = new Movie("Baby Driver", 4);
	
	System.out.println(m1.getTicketPrice());
	System.out.println(m2.getTicketPrice());
	System.out.println(m3.getTicketPrice());
	System.out.println(m4.getTicketPrice());
	System.out.println(m5.getTicketPrice());
	
	NetflixQueue nq= new NetflixQueue();
	
	nq.addMovie(m1);
	nq.addMovie(m2);
	nq.addMovie(m3);
	nq.addMovie(m4);
	nq.addMovie(m5);
	
	nq.sortMoviesByRating();
	
	nq.printMovies();
	
System.out.println("The best movie is" +nq.getBestMovie());
System.out.println("The second best movie is" +nq.getMovie(1));

	

}
}
