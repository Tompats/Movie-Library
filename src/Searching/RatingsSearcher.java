package Searching;
import java.util.ArrayList;
import Data.Ratings;
import DataLoading.MovieLoader;

public class RatingsSearcher {
	private ArrayList<Ratings> ratingsfromsearch = new ArrayList<Ratings>();
	private MovieSearcher moviesearcher;
	public RatingsSearcher(MovieLoader movieloader) {
		moviesearcher = new MovieSearcher(movieloader);
	}
	
	public void SearchRatingsForMovies(String name){
		for(int i=0;i<moviesearcher.SearchMovieByTitle(name).getRatingsList().size();i++) {
			ratingsfromsearch.add(moviesearcher.SearchMovieByTitle(name).getRatingsList().get(i));
		}
	}
	
	public ArrayList<Ratings> getRatingsFromSearch(){
		return ratingsfromsearch;
	}
}
