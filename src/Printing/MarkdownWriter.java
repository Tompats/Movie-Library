package Printing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import Data.Movie;
import Data.Ratings;
import Data.Tags;

public class MarkdownWriter {
	
	private String path;
	private PrintWriter outputWriter;
	
	public MarkdownWriter(String path) {
		this.path=path;
	}
	
	public boolean initWriter() {
		PrintWriter outputWriter = null;
		try{
			outputWriter = new PrintWriter(new FileOutputStream(path+".md"));
		}catch(FileNotFoundException e){
			System.out.println("Error opening file "+path);
			return false;
		}
		if(outputWriter!=null){
			this.outputWriter=outputWriter;
			return true;
		}
		return false;
	}
	
	public void writeMoviesInFile(ArrayList<Movie> movies) {
		for(Movie x:movies) {
			outputWriter.println("# "+x);
		}
	}
	
	public void writeTagsInFile(ArrayList<Tags> tags) {
		for(Tags x:tags) {
			outputWriter.println("#"+x);
		}
	}
	
	public void writeRatingsInFile(ArrayList<Ratings> ratings) {
		for(Ratings x: ratings) {
			outputWriter.println("# "+x);
		}
	}
	
	public void closeWriter(){
		outputWriter.close();
	}

}
