package MainEngine;

import java.util.Scanner;

import DataLoading.DataLoaderAndHolder;
import DataLoading.FactorLoader;
import Printing.FinalAnswers;
import Printing.PdfConverter;
import Printing.htmlResults;
import Printing.markdownResults;
import Printing.pdfResults;
import Printing.txtResults;
import Searching.FactorSearcher;

public class UserCom {
	private FactorLoader factorloader = new FactorLoader();
	private FactorSearcher factorsearcher;
	private FinalAnswers finalanswers;
	public UserCom() {
		
	}
	public void LoadMovies() {
		DataLoaderAndHolder dataloaderandholder = new DataLoaderAndHolder(factorloader);
		dataloaderandholder.LoadMovies();
	}
	public void LoadTagsAndRatings() {
		DataLoaderAndHolder dataloaderandholder = new DataLoaderAndHolder(factorloader);
		dataloaderandholder.LoadTagsAndRatings();
	}
	public void SearchMovieID(int id) {
		String s = " ";
		factorsearcher  = new FactorSearcher(factorloader,s);
		factorsearcher.setMovieResultsByID(id);
	}
	public void SearchMovie(String movie) {
		factorsearcher  = new FactorSearcher(factorloader,movie);
		factorsearcher.setMovieResults();
	}
	public void SearchActor(String actor) {
		factorsearcher  = new FactorSearcher(factorloader,actor);
		factorsearcher.setActorMovieResults();
	}
	public void SearchDirector(String director) {
		factorsearcher  = new FactorSearcher(factorloader,director);
		factorsearcher.setDirectorMovieResults();
	}
	public void SearchGenre(String genre) {
		factorsearcher  = new FactorSearcher(factorloader,genre);
		factorsearcher.setGenreMovieResults();
	}
	public void SearchCountry(String country) {
		factorsearcher  = new FactorSearcher(factorloader,country);
		factorsearcher.setCountryMovieResults();
	}
	public void SearchTags(String tags) {
		factorsearcher  = new FactorSearcher(factorloader,tags);
		factorsearcher.setTagsResults();
	}
	public void SearchRatings(String ratings) {
		factorsearcher  = new FactorSearcher(factorloader,ratings);
		factorsearcher.setRatingsResults();
	}
	public void PrintTXTMovies(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getMoviesFromSearch();
		txtResults results = new txtResults(name,finalanswers);
		results.PrintTheAnswer();
	}
	public void PrintPDFMovies(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getMoviesFromSearch();
		pdfResults results = new pdfResults(name,finalanswers);
		results.PrintTheAnswer();
	}
	public void PrintMDMovies(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getMoviesFromSearch();
		markdownResults results = new markdownResults(name,finalanswers);
		results.PrintTheAnswer();
	}
	public void PrintHTMLMovies(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getMoviesFromSearch();
		htmlResults results = new htmlResults(name,finalanswers);
		results.PrintTheAnswer();
	}
	public void PrintTXTTags(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getTagsFromSearch();
		txtResults results = new txtResults(name,finalanswers);
		results.PrintTheAnswerForTags();
	}
	public void PrintPDFTags(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getTagsFromSearch();
		pdfResults results = new pdfResults(name,finalanswers);
		results.PrintTheAnswerForTags();
	}
	public void PrintMDTags(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getTagsFromSearch();
		markdownResults results = new markdownResults(name,finalanswers);
		results.PrintTheAnswerForTags();
	}
	public void PrintHTMLTags(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getTagsFromSearch();
		htmlResults results = new htmlResults(name,finalanswers);
		results.PrintTheAnswerForTags();
	}
	public void PrintTXTRatings(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getRatingsFromSearch();
		txtResults results = new txtResults(name,finalanswers);
		results.PrintTheAnswerForRatings();
	}
	public void PrintPDFRatings(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getRatingsFromSearch();
		pdfResults results = new pdfResults(name,finalanswers);
		results.PrintTheAnswerForRatings();
	}
	public void PrintMDRatings(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getRatingsFromSearch();
		markdownResults results = new markdownResults(name,finalanswers);
		results.PrintTheAnswerForRatings();
	}
	public void PrintHTMLRatings(String name) {
		finalanswers = new FinalAnswers(factorsearcher);
		finalanswers.getRatingsFromSearch();
		htmlResults results = new htmlResults(name,finalanswers);
		results.PrintTheAnswerForRatings();
	}
	public void ConvertPDF(String name,String newname) {
		PdfConverter pdfconverter = new PdfConverter(name,newname);
		pdfconverter.ConvertTxtToPdf();
	}
}
