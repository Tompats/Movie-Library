package Printing;

import java.io.PrintWriter;
import java.util.ArrayList;
import Data.Ratings;
import Data.Tags;

public class pdfResults{
	private PDFWriter pdfwriter;
	private FinalAnswers finalanswers;
	public pdfResults(String path,FinalAnswers finalanswers) {
		pdfwriter = new PDFWriter(path);
		this.finalanswers=finalanswers;
	}
	public void PrintTheAnswer() {
		pdfwriter.MakePdfForMovies(finalanswers.getResults());
	}
	public void PrintTheAnswerForTags() {
			pdfwriter.MakePdfForTags(finalanswers.getTagsResults());
	}
	public void PrintTheAnswerForRatings() {
		pdfwriter.MakePdfForRatings(finalanswers.getRatingsResults());
	}
}