package DataLoading;
import java.util.ArrayList;
import Data.Director;

public class DirectorLoader{	
	private FileReader filereader;
	private ArrayList<Director> directorslist=new ArrayList<Director>();
	public DirectorLoader() {
		
	}
	public void LoadsMoviesInfo(){
		filereader=new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\movie_directors.dat");
		if(filereader.FindException()) {
			filereader.ReadTheFile();
		}
	}
	public void EditList(){
		for(int i=0;i<filereader.getList().size();i++) {
			String line= filereader.getList().get(i);
			String[] words = line.split("\t");
			int id = Integer.parseInt(words[0]);String dname=words[2];String directorid= words[1];
			boolean equals=false;
			for(Director x: directorslist) {
				if(x.getDirectorID().equals(directorid)) {
				x.addMovie(id);equals=true;
				}
			}
			if(equals == false) {
				Director director=new Director(dname,directorid);
				director.addMovie(id);
				directorslist.add(director);
			}
		}
	
	}
	public ArrayList<Director> getDirectorsList(){
		return directorslist;
	}
}