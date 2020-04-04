import java.util.Arrays;

public class Theater extends Venue{
	protected Movie[] Movies;
	public Movie[] getMovies() {
		return Movies;
	}
	public void setMovies(Movie[] movies) {
		Movies = movies;
	}
	public void displayInfo() {
		System.out.println(Arrays.toString(Movies));
	}
}
