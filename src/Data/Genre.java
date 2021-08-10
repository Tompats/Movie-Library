package Data;
import java.util.*;

public class Genre{
	private String name;
	private ArrayList<Integer> movies = new ArrayList<Integer>();
	public Genre(String name) {
		this.name = name;
	}
	public void addMovie(int x) {
		movies.add(x);
	}
	public ArrayList<Integer> getMovieslist(){
		return movies;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		String s=" ";
		s += name;
		return s;
	}
}
