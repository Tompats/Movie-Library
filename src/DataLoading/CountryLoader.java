package DataLoading;
import java.util.ArrayList;
import Data.Country;

public class CountryLoader {
	private FileReader filereader;
	private ArrayList<Country> countrieslist=new ArrayList<Country>();
	public CountryLoader() {
		
	}
	public void LoadsMoviesInfo() {
		filereader = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\movie_countries.dat");
		if(filereader.FindException()) { 
			filereader.ReadTheFile();
		}
	}
	public void EditTheList() {
		for(int i=0; i<filereader.getList().size(); i++) {
			String line = filereader.getList().get(i);
			String[] words = line.split("\t");
			int id = Integer.parseInt(words[0]);
			if(id!=985 && id!=1752 && id!=2855 &&id!=3915 && id!=6520 && id!=8579 && id!=43708 && id!=53883) {
			String name = words[1];
			boolean equals = false;
			for(Country x: countrieslist){
				if(x.getName().equals(name)){
					x.addMovie(id);equals = true;
				}
			}
			if(equals == false){
				Country country = new Country(name);
				country.addMovie(id);
				countrieslist.add(country);
			}
			}
		}
	}
	public ArrayList<Country> getCountriesList() {
		return countrieslist;
	}

}
