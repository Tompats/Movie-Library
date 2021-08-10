package DataLoading;

public class DataLoaderAndHolder {
	private FactorLoader factorloader = new FactorLoader() ;
	public DataLoaderAndHolder(FactorLoader factorloader) {
		this.factorloader=factorloader;
	}
	public void LoadMovies() {
		factorloader.LoadActors();
		factorloader.LoadCountries();
		factorloader.LoadDirectors();
		factorloader.LoadGenres();
		factorloader.LoadMovies();
		factorloader.SetMovieActors();
		factorloader.SetMovieCountries();
		factorloader.SetMovieDirectors();
		factorloader.SetMovieGenre();
	}
	public void LoadTagsAndRatings() {
		factorloader.LoadRatings();
		factorloader.LoadTags();
		factorloader.SetMovieRatings();
		factorloader.SetMovieTags();
	}
}
