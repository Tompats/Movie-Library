package Searching;
import java.util.ArrayList;
import DataLoading.GenreLoader;

public class GenreSearcher{
	private ArrayList<Integer> moviesfromsearch = new ArrayList<Integer>();
	private GenreLoader genreloader = new GenreLoader();
	public GenreSearcher(GenreLoader genreloader) {
		this.genreloader=genreloader;
	}
	public void SearchMovieByFactor(String name) {
		int wrong = 0;
		for(int i=0; i<genreloader.getGenresList().size(); i++) {
			String genrename = genreloader.getGenresList().get(i).getName();
			if(genrename.equals(name)) {
				wrong++;
				for(int j=0; j<genreloader.getGenresList().get(i).getMovieslist().size(); j++) {
					moviesfromsearch.add(genreloader.getGenresList().get(i).getMovieslist().get(j));
				}				
			}
		}
		if(wrong==0)  {System.out.println("Wrong genre's name");}
	}
	public ArrayList<Integer> getMoviesFromSearch(){
		return moviesfromsearch;
	}
}
