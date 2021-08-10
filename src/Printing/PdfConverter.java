package Printing;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import DataLoading.FileReader;

public class PdfConverter {
	private String oldpath;
	private String newpath;
	public PdfConverter(String oldpath,String newpath) {
		this.oldpath=oldpath;
		this.newpath=newpath;
	}
	public void ConvertTxtToPdf() {
		FileReader filereader = new FileReader(oldpath);
		if(filereader.FindException()) {
			filereader.ReadTheFile();
		}
		try {
			Document document = new Document();
			PdfWriter.getInstance(document,new FileOutputStream(newpath));
			document.open();
			for(int i =0;i<filereader.getList().size();i++) {
			document.add(new Paragraph(filereader.getList().get(i)));
			document.newPage();
			}
		document.close();
		}
		catch(Exception e) {}
		}
}
