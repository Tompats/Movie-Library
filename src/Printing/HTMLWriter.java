package Printing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Data.Movie;
import Data.Ratings;
import Data.Tags;

public class HTMLWriter {
		private String path;
		private String html = "<div>"; 
		public HTMLWriter(String path) {
			this.path=path;
		}
		public void MakeHtmlForMovies(ArrayList<Movie> movies){
			File f = new File(path);
			try {
				for(int i=0;i<movies.size();i++)
				{html+="<p>"+ movies.get(i)+"</p>";}
				html+="</div>";
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				bw.write(html);
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		public void MakeHtmlForTags(ArrayList<Tags> tags){
			File f = new File(path);
			try {
				for(int i=0;i<tags.size();i++)
				{html+="<p>"+ tags.get(i)+"</p>";}
				html+="</div>";
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				bw.write(html);
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		public void MakeHtmlForRatings(ArrayList<Ratings> ratings){
			File f = new File(path);
			try {
				for(int i=0;i<ratings.size();i++)
				{html+="<p>"+ ratings.get(i)+"</p>";}
				html+="</div>";
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				bw.write(html);
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
