package Searching;
import java.util.ArrayList;
import DataLoading.DirectorLoader;

public class DirectorSearcher{
//	private Director director = new Director();
	private ArrayList<Integer> moviesfromsearch = new ArrayList<Integer>();
	private DirectorLoader directorloader = new DirectorLoader();
	public DirectorSearcher (DirectorLoader directorloader) {
		this.directorloader = directorloader;
	}
	public void SearchMovieByFactor(String name) {
		int wrong = 0;
		for(int i=0; i<directorloader.getDirectorsList().size(); i++){
			String directorname = directorloader.getDirectorsList().get(i).getName();
			if(directorname.equals(name)) {
				wrong++;
				for(int j=0; j<directorloader.getDirectorsList().get(i).getMovieslist().size(); j++) {
					moviesfromsearch.add(directorloader.getDirectorsList().get(i).getMovieslist().get(j));
					
				}
			}
		}	
		if(wrong==0)  {System.out.println("Wrong director's name");}
	}
	public ArrayList<Integer> getMoviesFromSearch(){
		return moviesfromsearch;
	}
		
}
