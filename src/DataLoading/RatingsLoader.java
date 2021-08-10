package DataLoading;
import java.util.ArrayList;
import Data.Ratings;

public class RatingsLoader{
	private FileReader filereader;
	private ArrayList<Ratings> ratingslist=new ArrayList<Ratings>();
	
	public void LoadsRatingsInfo(){
		filereader = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\user_ratedmovies.dat");
		if(filereader.FindException()) {
			filereader.ReadTheFile();
		}
	}
	
	public void EditTheList() {
		for(int i=0;i<filereader.getList().size();i++) {
			String line = filereader.getList().get(i);
			String[] words = line.split("\t");
			int userid=Integer.parseInt(words[0]); 
			int movieid=Integer.parseInt(words[1]); 
			double score=Double.parseDouble(words[2]);
			String date = words[3]+"/"+words[4]+"/"+words[5]+" "+words[6]+":"+words[7]+":"+words[8];
			Ratings rating = new Ratings(userid,movieid,score,date);
			ratingslist.add(rating);
		}
	}
	public ArrayList<Ratings> getRatingsList(){
		return ratingslist;
	}

}
