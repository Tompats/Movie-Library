package Data;
import java.util.*;

public class Movie {
	private int id;
	private String title;
	private String spanishTitle;
	private ArrayList<String> locationsList= new ArrayList<String>();
	private int imdbID;
	private String rtID;
	private String[] urls=new String[2];
	private int year;
	private double adRat;
	private int adNumRat;
	private double adScore;
	private double[] critRats=new double[2];
	private int[] critNumRev=new int[2];
	private int[] critNumFresh=new int[2];
	private int[] critNumRt=new int[2];
	private double[] critScore=new double[2];
	private ArrayList<Actor> actorlist=new ArrayList<Actor>();
	private ArrayList<Director> directorlist=new ArrayList<Director>();
	private ArrayList<Country> countrylist=new ArrayList<Country>();
	private ArrayList<Genre> genrelist=new ArrayList<Genre>();
	private ArrayList<Tags> taglist=new ArrayList<Tags>();
	private ArrayList<Ratings> ratinglist=new ArrayList<Ratings>();
	public Movie(int id,String title,int imdbid,String spanishtitle,int year) {
		this.id=id;
		this.title=title;
		this.imdbID=imdbid;
		this.spanishTitle=spanishtitle;
		this.year=year;
	}
	public Movie(int id,String title,String spanishTitle,int imdbID,String rtID,int year,double adRat,int adNumRat,double adScore){
		this.id=id;
		this.title=title;
		this.spanishTitle=spanishTitle;
		this.imdbID=imdbID;
		this.rtID=rtID;
		this.year=year;
		this.adRat=adRat;
		this.adNumRat=adNumRat;
		this.adScore=adScore;
	}
	public void addLocation(String location) {
		int counter=0;
		for(int i=0;i<locationsList.size();i++) {
			if(location.equals(locationsList.get(i))) {
				counter++;
			}
		}
		if(counter==0) {
			locationsList.add(location);
		}
	}
	public void setUrl(String[] urls) {
		for(int i=0;i<2;i++) {
			this.urls[i]=urls[i];
		}
	}
	public void setCritRat(double[] critRats,double[] critScore) {
		for(int i=0;i<2;i++) {
			this.critRats[i]=critRats[i];
			this.critScore[i]=critScore[i];
		}
	}
	public void setCritNum(int[] critNumRev,int[] critNumFresh,int[] critNumRt) {
		for(int i=0;i<2;i++) {
			this.critNumRev[i]=critNumRev[i];
			this.critNumFresh[i]=critNumFresh[i];
			this.critNumRt[i]=critNumRt[i];
		}
		
	}
	public void setActorlist(Actor actor) {
		actorlist.add(actor);
	}
	public void setDirectorlist(Director director) {
		directorlist.add(director);
	}
	public void setCountrylist(Country country) {
		countrylist.add(country);
	}
	public void setGenrelist(Genre genre) {
		genrelist.add(genre);
	}
	public void setTagslist(Tags tags) {
		taglist.add(tags);
	}
	public void setRatingslist(Ratings ratings) {
		ratinglist.add(ratings);
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getSpanishTitle() {
		return spanishTitle;
	}
	public int getYear() {
		return year;
	}
	public int getImdbId() {
		return imdbID;
	}
	public String getRtId() {
		return rtID;
	}
	public double getAdRat() {
		return adRat;
	}
	public int getAdNumRat() {
		return adNumRat;
	}
	public double getAdScore() {
		return adScore;
	}
	public ArrayList<Tags> getTagsList(){
		return taglist;
	}
	public ArrayList<Ratings> getRatingsList(){
		return ratinglist;
	}
	public void EditLocations() {
		for(int i=0;i<locationsList.size()-1;i++) {
			for(int j=1;j<locationsList.size();j++) {
				if(locationsList.get(i)==locationsList.get(j)) {
					locationsList.remove(j);
				}
			}
		}
	}
	public String toString() {
		String e = " ";
		e +="\t"+"\t"+"\t"+"\t"+"Title:"+title+"\n"+"ID:"+id+"\n"+"Title In Spanish:"+spanishTitle+"\n"+"IMDB ID:"+imdbID+"\n"+"Rotten Tomatoes ID:"+rtID+"\n"+"Year:"+year+"\n"+"Audience Rating:"+adRat+"\n"+"Audience Number of Ratings:"+adNumRat+"\n"+"Audience Score:"+adScore+"\n"+"IMDB Url:"+urls[0]+" "+"Rotten Tomatoes Url:"+urls[1]+"\n"+"All Critics Ratings:"+critRats[0]+" "+"Top Critics Ratings:"+critRats[1]+"\n"+"All Critics Number of Reviews:"+critNumRev[0]+" "+"Top Critics Number of Reviews:"+critNumRev[1]+"\n"+"All Critics Number of Fresh:"+critNumFresh[0]+" "+"Top Critics Number of Fresh:"+critNumFresh[1]+"\n"+"All Critics Number of Rotten:"+critNumRt[0]+" "+"Top Critics Number of Rotten:"+critNumRt[1]+"\n"+"All Critics Score:"+critScore[0]+" "+"Top Critics Score:"+critScore[1]+"\n";            
		e += "Actors:";
		for(int i=0;i<actorlist.size();i++) {
			e += actorlist.get(i).NameToString(id)+"\t";
		}
		e +="\n"+"Genres:";
		for(int i=0;i<genrelist.size();i++) {
			e += genrelist.get(i)+" ";
		}
		e +="\n"+"Directors:";
		for(int i=0;i<directorlist.size();i++) {
			e += directorlist.get(i)+" ";
		}
		e+="\n"+"Countries:";
		for(int i=0;i<countrylist.size();i++) {
			e += countrylist.get(i)+" ";
		}
		e +="\n"+"Locations:";
		for(int i=0;i<locationsList.size();i++) {
			e += locationsList.get(i)+" ";
		}
		e+="\n"+"Ratings:";
		for(int i=0;i<ratinglist.size();i++) {
			e += ratinglist.get(i)+"\t";
		}
		e+="\n"+"Tags:";
		for(int i=0;i<taglist.size();i++) {
			e += taglist.get(i)+"\t";
		}
		
		e+="\n"+"\n";
		return e ;
	}
}

		
	
