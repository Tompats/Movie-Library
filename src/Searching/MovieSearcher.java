package Searching;
import Data.Movie;
import DataLoading.MovieLoader;

public class MovieSearcher{
	private Movie movie;
	private MovieLoader movieloader = new MovieLoader();
	public MovieSearcher(MovieLoader movieloader) {
		this.movieloader=movieloader;
	}
	public Movie SearchMovieByID(int id) {
		for(int i=0;i<movieloader.getMoviesList().size();i++) {
			int movieid = movieloader.getMoviesList().get(i).getId();
			if(movieid==id) {
				return movieloader.getMoviesList().get(i);
			}
		}
		return movie;
	}
	public Movie SearchMovieByTitle(String title) {
		for(int i=0;i<movieloader.getMoviesList().size();i++) {
			String movietitle = movieloader.getMoviesList().get(i).getTitle();
			if(movietitle.equals(title)) {
				return movieloader.getMoviesList().get(i);
			}
		}
		return movie;
	}
}
