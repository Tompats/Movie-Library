package DataLoading;
import Data.Movie;
import java.util.ArrayList;
public class MovieLoader{
	private FileReader filereader;
	private FileReader filereaderloc;
	private ArrayList<Movie> movieslist=new ArrayList<Movie>();
	public MovieLoader() {
		
	}
	public void LoadsMoviesInfo() {
		filereader = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\movies.dat");
		if(filereader.FindException()) { 
			filereader.ReadTheFile();
		}
	}
	public void EditList(){
		for(int i=0;i<filereader.getList().size();i++) {
			String line = filereader.getList().get(i);
			String[] words = line.split("\t");
			int counter=0;
			int size = words.length-1;
			for(int j=0;j<size;j++) {
				if(words[j].equals("\\N")==false) {
					counter++;
				}
				if(counter==20) {
					int id = Integer.parseInt(words[0]);
					String title = words[1];
					int imdbID = Integer.parseInt(words[2]);
					String spanishTitle = words[3];
					String urls[]=new String[2];urls[0]=words[4];urls[1]=words[size];
					int year = Integer.parseInt(words[5]);
					String rtID = words[6];
					double critRats[]=new double[2];critRats[0]=Double.parseDouble(words[7]);critRats[1]=Double.parseDouble(words[12]);
					int critNumRev[]=new int[2];critNumRev[0]=Integer.parseInt(words[8]);critNumRev[1]=Integer.parseInt(words[13]);
					int critNumFresh[]=new int[2];critNumFresh[0]=Integer.parseInt(words[9]);critNumFresh[1]=Integer.parseInt(words[14]);
					int critNumRt[]=new int[2];critNumRt[0]=Integer.parseInt(words[10]);critNumRt[1]=Integer.parseInt(words[15]);
					double critScore[]=new double[2];critScore[0]=Double.parseDouble(words[11]);critScore[1]=Double.parseDouble(words[16]);
					double adRat = Double.parseDouble(words[17]);
					int adNumRat = Integer.parseInt(words[18]);
					double adScore = Double.parseDouble(words[19]);
					Movie movie = new Movie(id,title,spanishTitle,imdbID,rtID,year,adRat,adNumRat,adScore);
					movie.setUrl(urls);movie.setCritNum(critNumRev, critNumFresh, critNumRt);movie.setCritRat(critRats, critScore);
					movieslist.add(movie);
				}
			}
		}
	}
	public void LoadsLocationsInfo() {
		filereaderloc = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\movie_locations.dat");
		if(filereaderloc.FindException()) {
			filereaderloc.ReadTheFile();
		}
	}
	public void EditLocationsList() {
		for(int i=0;i<filereaderloc.getList().size();i++) {
			String line = filereaderloc.getList().get(i);
			String[] words = line.split("\t");
			int id = Integer.parseInt(words[0]);
			for(int j=0;j<movieslist.size();j++) {
				if(id == movieslist.get(j).getId()) {
					for(int k=1;k<words.length;k++) {
						movieslist.get(j).addLocation(words[k]);
					}
				}
			}
		}
	}
	public ArrayList<Movie> getMoviesList(){
		return movieslist;
	}
}
