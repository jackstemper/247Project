import java.util.Arrays;
/* 
* Theater Class : extends Venue , holds constructor for Theater, functions for setting and getting the 
* movie array, displays the Movie array contents
*/
public class Theater extends Venue {

	protected Movie[] Movies;
	public Theater(String name, String address, Movie[] movies) {
		Address = address;
		Name = name;
		Movies = movies;
	}
	public Movie[] getMovies() {
		return Movies;
	}
	public void setMovies(Movie[] movies) {
		Movies = movies;
	}
	public void displayInfo() {
		System.out.println(Arrays.toString(Movies));
	}
	public void printMovies() {
		System.out.println("The movies showing at " + this.Name + "are:");
		for(int i=0; i<Movies.length;i++) {
			System.out.println(Movies[i].getTitle() + "at: " + Movies[i].getTime());
		}
	}

}
