package Searching;
import java.util.ArrayList;
import Data.Movie;
import Data.Tags;
import Data.Ratings;
import DataLoading.FactorLoader;

public class FactorSearcher {
	private FactorLoader factorloader = new FactorLoader();
	private ArrayList<Movie> results = new ArrayList<Movie>();
	private ArrayList<Tags> tagsresults = new ArrayList<Tags>();
	private ArrayList<Ratings> ratingsresults = new ArrayList<Ratings>();
	private String name;
	private ActorSearcher actorsearcher;
	private CountrySearcher countrysearcher;
	private DirectorSearcher directorsearcher;
	private GenreSearcher genresearcher;
	private MovieSearcher moviesearcher;
	private TagsSearcher tagssearcher;
	private RatingsSearcher ratingssearcher;
	public FactorSearcher(FactorLoader factorloader,String name) {
		this.name=name;
		this.factorloader=factorloader;
		actorsearcher = new ActorSearcher(factorloader.getActorLoader());
		countrysearcher = new CountrySearcher(factorloader.getCountryLoader());
		directorsearcher = new DirectorSearcher(factorloader.getDirectorLoader());
		genresearcher = new GenreSearcher(factorloader.getGenreLoader());
		moviesearcher = new MovieSearcher(factorloader.getMovieLoader());
		tagssearcher = new TagsSearcher(factorloader.getMovieLoader());
		ratingssearcher = new RatingsSearcher(factorloader.getMovieLoader());
	}
	public void setActorMovieResults() {
		actorsearcher.SearchMovieByFactor(name);
		for(int i=0; i<actorsearcher.getMoviesFromSearch().size(); i++) {
			results.add(moviesearcher.SearchMovieByID(actorsearcher.getMoviesFromSearch().get(i)));			
		}
	}
	public void setCountryMovieResults() {
		countrysearcher.SearchMovieByFactor(name);
		for(int i=0; i<countrysearcher.getMoviesFromSearch().size(); i++) {
			results.add(moviesearcher.SearchMovieByID(countrysearcher.getMoviesFromSearch().get(i)));			
		}
	}
	public void setDirectorMovieResults() {
		directorsearcher.SearchMovieByFactor(name);
		for(int i=0; i<directorsearcher.getMoviesFromSearch().size(); i++) {
			results.add(moviesearcher.SearchMovieByID(directorsearcher.getMoviesFromSearch().get(i)));			
		}
	}
	public void setGenreMovieResults() {
		genresearcher.SearchMovieByFactor(name);
		for(int i=0; i<genresearcher.getMoviesFromSearch().size(); i++) {
			results.add(moviesearcher.SearchMovieByID(genresearcher.getMoviesFromSearch().get(i)));			
		}
	}
	public void setMovieResults() {
		results.add(moviesearcher.SearchMovieByTitle(name));
	}
	public void setMovieResultsByID(int id) {
		results.add(moviesearcher.SearchMovieByID(id));
	}
	public void setTagsResults() {
		tagssearcher.SearchTagsForMovies(name);
		for(int i=0;i<tagssearcher.getTagsFromSearch().size();i++) {
			tagsresults.add(tagssearcher.getTagsFromSearch().get(i));
		}
	}
	public void setRatingsResults() {
		ratingssearcher.SearchRatingsForMovies(name);
		for(int i=0;i<ratingssearcher.getRatingsFromSearch().size();i++) {
			ratingsresults.add(ratingssearcher.getRatingsFromSearch().get(i));
		}
	}
	public FactorLoader getFactorLoader() {
		return factorloader;
	}
	public ArrayList<Movie> getMovieResults(){
		return results;
	}
	public ArrayList<Tags> getTagsResults(){
		return tagsresults;
	}
	public ArrayList<Ratings> getRatingsResults(){
		return ratingsresults;
	}
}
