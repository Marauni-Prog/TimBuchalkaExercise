package polymorphism;

public class Movie {
	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public void watchMovie() {
		String instanceType = this.getClass().getSimpleName();
		System.out.println(title + " is a " + instanceType + " film");
	}
	
	public static Movie getMovie(String type, String title) {
		return switch(Character.toUpperCase(type.charAt(0))){
		case 'A'->new Adventure(title);
		case 'T'->new Thriller(title);
		case 'S'-> new ScienceFiction(title);
		default->new Movie(title);
			
		};
	}

}

class Adventure extends Movie {

	public Adventure(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf("...%s%n".repeat(3), "Pleasant Scene", 
				"Scary music", "Something bad happens");
	}
}

class Thriller extends Movie {

	public Thriller(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.println("""
				...The protagonist faces adversity
				...Bad men do bad stuff.
				...The protagonist faces bad men.
				...The protagosts kill bad men.
				...Everyone is happy
				""");
	}
}

class ScienceFiction extends Movie {

	public ScienceFiction(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf("...%s%n".repeat(3), "Planet attacked by bad alliens", 
				"Bad Aliens do bad stuff", "Super heros fight aliens");
	}
}