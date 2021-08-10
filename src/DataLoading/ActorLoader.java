package DataLoading;
import java.util.ArrayList;
import Data.Actor;

public class ActorLoader{
		private ArrayList<Actor> actorslist = new ArrayList<Actor>();
		private FileReader filereader;
		public ActorLoader() {
			
		}
		public void LoadsMoviesInfo(){
			filereader = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\movie_actors.dat");
			if(filereader.FindException()) {
				filereader.ReadTheFile();
			}
		}
		public void EditTheList() {
			for(int i=0;i<filereader.getList().size();i++) {
				String line = filereader.getList().get(i);
				String[] words = line.split("\t");
				if(words[1].equals("erik_von_detten") || words[1].equals("don_rickles") || words[1].equals("tim_mcinnerny")) {}
				else 
				{
					int id = Integer.valueOf(words[0]);
					int ranking = Integer.valueOf(words[3]);
					String name = words[2];
					String actorid = words[1];
					boolean equals = false; 
					for(Actor x: actorslist){
						if(x.getActorID().equals(actorid)){
							x.addMovieAndRanking(id,ranking);equals=true;
						}
					}	
					if(equals == false) {
						Actor actor = new Actor(name,actorid);
						actor.addMovieAndRanking(id,ranking);
						actorslist.add(actor);
					}
				}
			}
		}
		public ArrayList<Actor> getActorsList(){
			return actorslist;
		}
}
