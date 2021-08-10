package DataLoading;

public class FactorLoader {
	private ActorLoader actorloader=new ActorLoader();
	private CountryLoader countryloader=new CountryLoader();
	private DirectorLoader directorloader=new DirectorLoader();
	private GenreLoader genreloader=new GenreLoader();
	private MovieLoader movieloader=new MovieLoader();
	private TagsLoader tagsloader=new TagsLoader();
	private RatingsLoader ratingsloader=new RatingsLoader();
	public FactorLoader() {
		
	}
	public void LoadActors() {
		actorloader.LoadsMoviesInfo();
		actorloader.EditTheList();
	}
	public void LoadCountries() {
		countryloader.LoadsMoviesInfo();
		countryloader.EditTheList();
	}
	public void LoadDirectors() {
		directorloader.LoadsMoviesInfo();
		directorloader.EditList();
	}
	public void LoadGenres() {
		genreloader.LoadsMoviesInfo();
		genreloader.EditTheList();
	}
	public void LoadMovies() {
		movieloader.LoadsMoviesInfo();
		movieloader.LoadsLocationsInfo();
		movieloader.EditList();
		movieloader.EditLocationsList();
	}
	public void LoadTags() {
		tagsloader.LoadTagsInfo();
		tagsloader.EditTheList();
		tagsloader.EditTags();
	}
	public void LoadRatings() {
		ratingsloader.LoadsRatingsInfo();
		ratingsloader.EditTheList();
	}
	public void SetMovieActors() {
		for(int i=0;i<actorloader.getActorsList().size();i++) {
			for(int j=0;j<actorloader.getActorsList().get(i).getMoviesID().size();j++) {
				int id = actorloader.getActorsList().get(i).getMoviesID().get(j);
				for(int k=0;k<movieloader.getMoviesList().size();k++) {
					if(id == movieloader.getMoviesList().get(k).getId()) {
						movieloader.getMoviesList().get(k).setActorlist(actorloader.getActorsList().get(i));
					}
				}
			}		
		}
	}
	public void SetMovieCountries() {
		for(int i=0;i<countryloader.getCountriesList().size();i++) {
			for(int j=0;j<countryloader.getCountriesList().get(i).getMovieslist().size();j++) {
				int id = countryloader.getCountriesList().get(i).getMovieslist().get(j);
				for(int k=0;k<movieloader.getMoviesList().size();k++) {
					if(id == movieloader.getMoviesList().get(k).getId()) {
						movieloader.getMoviesList().get(k).setCountrylist(countryloader.getCountriesList().get(i));
					}
				}
			}
		}
	}
	public void SetMovieDirectors() {
		for(int i=0;i<directorloader.getDirectorsList().size();i++) {
			for(int j=0;j<directorloader.getDirectorsList().get(i).getMovieslist().size();j++) {
				int id = directorloader.getDirectorsList().get(i).getMovieslist().get(j);
				for(int k=0;k<movieloader.getMoviesList().size();k++) {
					if(id == movieloader.getMoviesList().get(k).getId()) {
						movieloader.getMoviesList().get(k).setDirectorlist(directorloader.getDirectorsList().get(i));
					}
				}
			}
		}
	}
	public void SetMovieGenre() {
		for(int i=0;i<genreloader.getGenresList().size();i++) {
			for(int j=0;j<genreloader.getGenresList().get(i).getMovieslist().size();j++) {
				int id = genreloader.getGenresList().get(i).getMovieslist().get(j);
				for(int k=0;k<movieloader.getMoviesList().size();k++) {
					if(id == movieloader.getMoviesList().get(k).getId()) {
						movieloader.getMoviesList().get(k).setGenrelist(genreloader.getGenresList().get(i));
					}
				}
			}
		}
	}
	public void SetMovieTags() {
		for(int i=0;i<tagsloader.getTagsList().size();i++) {
			int id = tagsloader.getTagsList().get(i).getMovieid();
				for(int k=0;k<movieloader.getMoviesList().size();k++) {
					if(id == movieloader.getMoviesList().get(k).getId()) {
						movieloader.getMoviesList().get(k).setTagslist(tagsloader.getTagsList().get(i));
					}
				}
		}
	}
	public void SetMovieRatings() {
		for(int i=0;i<ratingsloader.getRatingsList().size();i++) {
			int id = ratingsloader.getRatingsList().get(i).getMovieid();
				for(int k=0;k<movieloader.getMoviesList().size();k++) {
					if(id == movieloader.getMoviesList().get(k).getId()) {
						movieloader.getMoviesList().get(k).setRatingslist(ratingsloader.getRatingsList().get(i));
					}	
				}
		}
	}
	public ActorLoader getActorLoader() {
		return actorloader;
	}
	public CountryLoader getCountryLoader() {
		return countryloader;
	}
	public DirectorLoader getDirectorLoader() {
		return directorloader;
	}
	public GenreLoader getGenreLoader() {
		return genreloader;
	}
	public MovieLoader getMovieLoader() {
		return movieloader;
	}
}