package DataLoading;
import java.util.ArrayList;
import Data.Tags;

public class TagsLoader{
	private FileReader filereader;
	private FileReader filereadertag;
	private ArrayList<Tags> tagslist=new ArrayList<Tags>();
	public void LoadTagsInfo(){
		filereader = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\user_taggedmovies.dat");
		filereadertag = new FileReader("..\\Software Dev\\src\\DataLoading\\Files\\tags.dat");
		if(filereader.FindException()) {
			filereader.ReadTheFile();
		}
		if(filereadertag.FindException()) {
			filereadertag.ReadTheFile();
		}
	}
	public void EditTheList() {
		for(int i=0;i<filereader.getList().size();i++) {
			String line = filereader.getList().get(i);
			String[] words = line.split("\t");
			int userid=Integer.parseInt(words[0]); 
			int movieid=Integer.parseInt(words[1]); 
			int tagid=Integer.parseInt(words[2]);
			String date = words[3]+"/"+words[4]+"/"+words[5]+" "+words[6]+":"+words[7]+":"+words[8];
			Tags tag = new Tags(userid,movieid,tagid,date);
			tagslist.add(tag);
		}
	}
	public void EditTags() {
		for(int i=0;i<filereadertag.getList().size();i++) {
			String line = filereadertag.getList().get(i);
			String[] words = line.split("\t");
			int id = Integer.parseInt(words[0]);
			String value = words[1];
			for(int j=0;j<tagslist.size();j++) {
				if(tagslist.get(j).getTagid() == id) {
					tagslist.get(j).addValue(value);
				}
			}
		}
	}
	public ArrayList<Tags> getTagsList(){
		return tagslist;
	}
}
