package Printing;

public class txtResults{
	private FileWriter filewriter;
	private FinalAnswers finalanswers;
	public txtResults(String path,FinalAnswers finalanswers) {
		filewriter = new FileWriter(path);
		this.finalanswers=finalanswers;
	}
	public void PrintTheAnswer() {
		if(filewriter.initWriter()) {
			filewriter.writeFile(finalanswers.getResults());
			filewriter.closeWriter();
		}
	}
	public void PrintTheAnswerForTags() {
		if(filewriter.initWriter()) {
		filewriter.writeTagsInFile(finalanswers.getTagsResults());
		filewriter.closeWriter();
		}
	}
	public void PrintTheAnswerForRatings() {
		if(filewriter.initWriter()) {
		filewriter.writeRatingsInFile(finalanswers.getRatingsResults());
		filewriter.closeWriter();
		}
	}
}


