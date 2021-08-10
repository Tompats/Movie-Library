package Searching;
import DataLoading.ActorLoader;
import java.util.ArrayList;

public class ActorSearcher{
	private ArrayList<Integer> moviesfromsearch = new ArrayList<Integer>();
	private ActorLoader actorloader = new ActorLoader();
	public ActorSearcher(ActorLoader actorloader) {
		this.actorloader=actorloader;
	}
	public void SearchMovieByFactor(String name) {
		int wrong = 0;
		for(int i=0;i<actorloader.getActorsList().size();i++) {
			String actorname = actorloader.getActorsList().get(i).getName();
			if(actorname.equals(name)) {
				wrong++;
				int size = actorloader.getActorsList().get(i).getMoviesID().size();
				for(int j=0;j<size;j++) {
					moviesfromsearch.add(actorloader.getActorsList().get(i).getMoviesID().get(j));
				}
			}
		}
		if(wrong==0)  {System.out.println("Wrong actor's name");}
	}
	public ArrayList<Integer> getMoviesFromSearch(){
		 return moviesfromsearch;
	}
}
