package Searching;
import java.util.ArrayList;
import DataLoading.CountryLoader;

public class CountrySearcher{
	private CountryLoader countryloader = new CountryLoader();
	private ArrayList<Integer> moviesfromsearch = new ArrayList<Integer>();
	public CountrySearcher(CountryLoader countryloader) {
		this.countryloader=countryloader;
		
	}
	public void SearchMovieByFactor(String name) {
		int wrong=0;
		for(int i=0; i<countryloader.getCountriesList().size(); i++) {
			String countryname = countryloader.getCountriesList().get(i).getName();
			if(countryname.equals(name)) {
				wrong++;
				for(int j=0; j<countryloader.getCountriesList().get(i).getMovieslist().size(); j++) {
					moviesfromsearch.add(countryloader.getCountriesList().get(i).getMovieslist().get(j));
				}				
			}
		}
		if(wrong==0)  {System.out.println("Wrong country's name");}
	}
	public ArrayList<Integer> getMoviesFromSearch(){
		return moviesfromsearch;
	}
}
