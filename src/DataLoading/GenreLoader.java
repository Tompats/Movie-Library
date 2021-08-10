package DataLoading;
import java.util.ArrayList;
import Data.Genre;

public class GenreLoader{
	private FileReader filereader;
	private ArrayList<Genre> genreslist=new ArrayList<Genre>();
	public GenreLoader() {
		
	}
	public void LoadsMoviesInfo() {
		filereader = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\movie_genres.dat");
		if(filereader.FindException()) { 
			filereader.ReadTheFile();
		}
	}
	public void EditTheList() {
		for(int i=0; i<filereader.getList().size(); i++) {
			String line = filereader.getList().get(i);
			String[] words = line.split("\t");
			int id = Integer.parseInt(words[0]);String name = words[1];
			boolean equals = false;
			for(Genre x: genreslist){
				if(x.getName().equals(name)){
					x.addMovie(id);equals = true;
				}
			}
			if(equals == false){
				Genre genre = new Genre(name);
				genre.addMovie(id);
				genreslist.add(genre);
			}
		}
	}
	public ArrayList<Genre> getGenresList() {
		return genreslist;
	}

}