package Printing;
import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import Data.Movie;
import Data.Ratings;
import Data.Tags;

class FileWriter
{
	private String path;
	private FileOutputStream outputStream = null;
	private PrintWriter outputWriter = null;
	public FileWriter(String path)
	{
		this.path = path;
	}
	public boolean initWriter()
	{
		try
		{
			outputStream = new FileOutputStream(path);
		}
		catch(FileNotFoundException e)
		{
			return false;
		}
		return true;
	}
	public void writeFile(ArrayList<Movie> movies)
	{
		outputWriter = new PrintWriter(outputStream);
		for(int i=0;i<movies.size();i++)
		{
			outputWriter.println(movies.get(i));
		}
	}
	public void writeTagsInFile(ArrayList<Tags> tags) {
		outputWriter = new PrintWriter(outputStream);
		for(int i=0;i<tags.size();i++)
		{
			outputWriter.println(tags.get(i));
		}
	}
	public void writeRatingsInFile(ArrayList<Ratings> ratings) {
		outputWriter = new PrintWriter(outputStream);
		for(int i=0;i<ratings.size();i++)
		{
			outputWriter.println(ratings.get(i));
		}
	}
	public void closeWriter()
	{
		outputWriter.close();
	}
}