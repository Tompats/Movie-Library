package Printing;

public class htmlResults{
	private HTMLWriter htmlwriter;
	private FinalAnswers finalanswers;
	public htmlResults(String path,FinalAnswers finalanswers) {
		htmlwriter = new HTMLWriter(path);
		this.finalanswers=finalanswers;
	}
	public void PrintTheAnswer() {
		htmlwriter.MakeHtmlForMovies(finalanswers.getResults());
	}
	public void PrintTheAnswerForTags() {
		htmlwriter.MakeHtmlForTags(finalanswers.getTagsResults());
	}
	public void PrintTheAnswerForRatings() {
		htmlwriter.MakeHtmlForRatings(finalanswers.getRatingsResults());
	}
}



