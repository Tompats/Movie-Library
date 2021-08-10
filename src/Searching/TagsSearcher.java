package Searching;
import java.util.ArrayList;
import Data.Tags;
import DataLoading.MovieLoader;

public class TagsSearcher {
	private ArrayList<Tags> tagsfromsearch = new ArrayList<Tags>();
	private MovieSearcher moviesearcher;
	public TagsSearcher(MovieLoader movieloader) {
		moviesearcher = new MovieSearcher(movieloader);
	}
	public void SearchTagsForMovies(String name) {
		for(int i=0;i<moviesearcher.SearchMovieByTitle(name).getTagsList().size();i++) {
			tagsfromsearch.add(moviesearcher.SearchMovieByTitle(name).getTagsList().get(i));
		}
	}
	public ArrayList<Tags> getTagsFromSearch(){
		return tagsfromsearch;
	}
}
