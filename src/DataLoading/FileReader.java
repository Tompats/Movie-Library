package DataLoading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	private String path=" ";
	private ArrayList<String> filelines;
	private Scanner inputReader = null;
	public FileReader(String path) {
		this.path = path;
	}
	public boolean FindException() {
		try
		{
			inputReader = new Scanner(new FileInputStream(path));
		}
		catch(FileNotFoundException e)
		{
			return false;
		}
		return true;
	}
	public void ReadTheFile(){
		filelines = new ArrayList<String>();
		while(inputReader.hasNextLine()) {
			String line = inputReader.nextLine();
			filelines.add(line);
		}
		filelines.remove(0);
		inputReader.close();
	}
	public ArrayList<String> getList(){
		return filelines;
	}
}
