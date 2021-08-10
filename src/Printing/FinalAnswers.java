package Printing;
import Data.Movie;
import Searching.FactorSearcher;
import Data.Ratings;
import Data.Tags;
import java.util.ArrayList;


public class FinalAnswers {
	private FactorSearcher factorsearcher;
	private ArrayList<Movie> results = new ArrayList<Movie>();
	private ArrayList<Ratings> ratingsresults = new ArrayList<Ratings>();
	private ArrayList<Tags> tagsresults = new ArrayList<Tags>();		
	public FinalAnswers(FactorSearcher factorsearcher) {
		this.factorsearcher=factorsearcher;
	}
	public void getMoviesFromSearch() {
		for(int i=0;i<factorsearcher.getMovieResults().size();i++) {
			results.add(factorsearcher.getMovieResults().get(i));
		}
	}
	public void getTagsFromSearch() {
		for(int i=0;i<factorsearcher.getTagsResults().size();i++) {
			tagsresults.add(factorsearcher.getTagsResults().get(i));
		}
	}
	public void getRatingsFromSearch() {
		for(int i=0;i<factorsearcher.getRatingsResults().size();i++) {
			ratingsresults.add(factorsearcher.getRatingsResults().get(i));
		}
	}
	public ArrayList<Movie> getResults(){
		return results;
	}
	public ArrayList<Tags> getTagsResults(){
		return tagsresults;
	}
	public ArrayList<Ratings> getRatingsResults() {
		return ratingsresults;
	}
}
