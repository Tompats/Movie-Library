package Data;
import java.util.*;
public class Actor{
	private String name;
	private String actorid;
	private HashMap<Integer,Integer> rankingsformovies = new HashMap<Integer,Integer>();
	public Actor() {
		
	}
	public Actor(String name,String actorid) {
		this.name = name;
		this.actorid = actorid;
	}
	public void addMovieAndRanking(int x, int y) {
		rankingsformovies.put(x,y);
		
	}
	public HashMap<Integer,Integer> getMovieslist(){
		return rankingsformovies;
	}
	public String getActorID() {
		return actorid;
	}
	public ArrayList<Integer> getMoviesID() {
		ArrayList<Integer> moviesid=new ArrayList<Integer>();
		for(int movie: rankingsformovies.keySet()) {
			moviesid.add(movie);
		}
		return moviesid;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		String s = name + " " + actorid;
		for(Integer movie: rankingsformovies.keySet()) {
			s+=movie+":";
			s+= rankingsformovies.get(movie)+" ";
		}
		return s;
	}
	public String NameToString(int id) {
		String s = " ";
		s+= name+" "+"Ranking:";
		for(Integer movie: rankingsformovies.keySet()) {
			if(id==movie) {
				s += rankingsformovies.get(movie)+" ";
			}
		}
		return s;
	}
}
