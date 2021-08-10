package Printing;

import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import Data.Movie;
import Data.Ratings;
import Data.Tags;

public class PDFWriter {
	private String path;
	public PDFWriter(String path) {
		this.path=path;
	}
	public void MakePdfForMovies(ArrayList<Movie> movies){
		try {
		Document document = new Document();
		PdfWriter.getInstance(document,new FileOutputStream(path));
		document.open();
		for(int i=0;i<movies.size();i++)
		{
			if(movies.get(i)!=null) {
				document.add(new Paragraph(movies.get(i).toString()));
				document.newPage();
			}
		}
		document.close();
		}
		catch(Exception e) {}
	}
	public void MakePdfForTags(ArrayList<Tags> tags){
		try {
		Document document = new Document();
		PdfWriter.getInstance(document,new FileOutputStream(path));
		document.open();
		for(int i=0;i<tags.size();i++)
		{
			if(tags.get(i)!=null) {
				document.add(new Paragraph(tags.get(i).toString()));
				document.newPage();
			}
		}
		document.close();
		}
		catch(Exception e) {}
	}
	public void MakePdfForRatings(ArrayList<Ratings> ratings){
		try {
		Document document = new Document();
		PdfWriter.getInstance(document,new FileOutputStream(path));
		document.open();
		for(int i=0;i<ratings.size();i++)
		{
			if(ratings.get(i)!=null) {
				document.add(new Paragraph(ratings.get(i).toString()));
				document.newPage();
			}
		}
		document.close();
		}
		catch(Exception e) {}
	}
}
	