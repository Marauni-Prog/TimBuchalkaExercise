package polymorphism;

public class Main {
	public static void main(String[]args) {
		Movie themovie= new Movie("THE CONRACTOR");
		themovie.watchMovie();
		
		Movie mymovie= new Adventure("Alice In the Boarder lands");
		mymovie.watchMovie();
		Movie action = new Thriller("EXPENDABLES");
		action.watchMovie();
		Movie scifi= new ScienceFiction("AVATER");
		scifi.watchMovie();
		
		
		Movie theMovie= Movie.getMovie("Science fiction", "AVENGERS END GAME");
		theMovie.watchMovie();
		Movie theMovie1= Movie.getMovie("T", "AVENGERS END GAME");
		theMovie1.watchMovie();
		Movie theMovie2= Movie.getMovie("a", "AVENGERS END GAME");
		theMovie2.watchMovie();
	}
}
