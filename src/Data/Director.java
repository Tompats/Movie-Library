package Data;
import java.util.*;

public class Director{
	private String name;
	private String directorid;
	private ArrayList<Integer> movies = new ArrayList<Integer>();
	public Director(String name,String directorid) {
		this.name = name;
		this.directorid=directorid;
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
	public String getDirectorID() {
		return directorid;
	}
	public String toString() {
		String s=" ";
		s+=name;
		return s;
	}
}
