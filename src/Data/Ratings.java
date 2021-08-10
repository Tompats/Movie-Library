package Data;

public class Ratings{
	private int userid;
	private double rating;
	private String date;
	private int movieid;
	public Ratings() {
		
	}
	public Ratings(int userid,int movieid,double rating,String date) {
		this.userid=userid; this.rating=rating; this.movieid=movieid; this.date=date;
	}
	public int getMovieid() {
		return movieid;
	}
	public int getUserID() {
		return userid;
	}
	public double getRating() {
		return rating;
	}
	public String getDate() {
		return date;
	}
	public String toString() {
		String s=" ";
		s+=userid+" "+rating+" "+date;
		return s;
	}
	
}
