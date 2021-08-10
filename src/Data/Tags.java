package Data;

public class Tags {
	private int userid;
	private int tagid;
	private String value;
	private String date;
	private int movieid;
	
	
	public Tags() {
		
	}
	public Tags(int userid,int movieid,int tagid,String date) {
		this.userid=userid;
		this.movieid=movieid;
		this.tagid=tagid;
		this.date=date;
	}
	public void addValue(String value) {
		this.value=value;
	}
	public int getTagid() {
		return tagid;
	}
	public int getMovieid() {
		return movieid;
	}
	public String getValue() {
		return value;
	}
	public String getDate() {
		return date;
	}
	public int getUserID() {
		return userid;
	}
	public String toString() {
		String s=" ";
		s+=userid+" "+tagid+" "+value+" "+date;
		return s;
	}
}
