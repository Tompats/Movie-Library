package Printing;

public class markdownResults{
	private MarkdownWriter markdownwriter;
	private FinalAnswers finalanswers;
	public markdownResults(String path,FinalAnswers finalanswers) {
		markdownwriter = new MarkdownWriter(path);
		this.finalanswers=finalanswers;
	}
	public void PrintTheAnswer() {
		if(markdownwriter.initWriter()) {
		markdownwriter.writeMoviesInFile(finalanswers.getResults());
		}
		markdownwriter.closeWriter();
	}
	public void PrintTheAnswerForTags() {
		if(markdownwriter.initWriter()) {
		markdownwriter.writeTagsInFile(finalanswers.getTagsResults());
		}
		markdownwriter.closeWriter();
	}
	public void PrintTheAnswerForRatings() {
		if(markdownwriter.initWriter()) {
		markdownwriter.writeRatingsInFile(finalanswers.getRatingsResults());
		}
		markdownwriter.closeWriter();
	}
}
