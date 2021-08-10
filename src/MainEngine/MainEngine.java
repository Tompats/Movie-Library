package MainEngine;

import java.util.Scanner;

import Searching.FactorSearcher;


public class MainEngine {
	private static Scanner input;

	public static void main(String args[]) {
		
		UserCom user = new UserCom();
		System.out.println("Welcome!");
		String exit = "1";
		int ml=0;
		int trl=0;
		while(exit.equals("0")==false){
			System.out.println("Press 1 for browsing movies or press 2 for browsing tags and ratings");
			Scanner input = new Scanner(System.in);
			String x = input.nextLine();
			while(x.equals("1")==false && x.equals("2")==false) {
				System.out.println("Press 1 for browsing movies or press 2 for browsing tags and ratings");
				x = input.nextLine();
			}
			if(x.equals("1") && ml!=1) {System.out.println("Loading...Please wait!");user.LoadMovies();System.out.println("Movies have been loaded");ml=1;}
			else if(x.equals("2")&& trl!=1) {System.out.println("Loading...Please wait!");user.LoadTagsAndRatings();System.out.println("Tags and ratings have been loaded");trl=1;}
			if(ml==1 && trl!=1) {
				System.out.println("You want to load tags and ratings now?");
				System.out.println("Press y if you want or n if you dont");
				String y = input.nextLine();
				if(y.equals("y")) {System.out.println("Loading...Please wait!");user.LoadTagsAndRatings();System.out.println("Tags and ratings have been loaded");trl=1;}
			}
			else if(ml!=1 && trl==1){
				System.out.println("You want to load movies now?");
				System.out.println("Press y if you want or n if you dont");
				String y = input.nextLine();
				if(y.equals("y")){System.out.println("Loading...Please wait!");user.LoadMovies();System.out.println("Movies have been loaded");ml=1;}
			}
			System.out.println("Search by actor with a");
			System.out.println("Search by director with d");
			System.out.println("Search by country with c");
			System.out.println("Search by genre with g");
			System.out.println("Search by tags with t");
			System.out.println("Search by ratings with r");
			System.out.println("Search by movie id with i");
			System.out.println("Search by movie title with m");
			String w = input.nextLine();
			if(w.equals("a")) {
				System.out.println("Give Actor's name:");
				String name = input.nextLine();
				user.SearchActor(name);
			}
			else if(w.equals("d")) {
				System.out.println("Give Director's name:");
				String name = input.nextLine();
				user.SearchDirector(name);
			}
			else if(w.equals("c")) {
				System.out.println("Give Country's name:");
				String name = input.nextLine();
				user.SearchCountry(name);
			}
			else if(w.equals("g")) {
				System.out.println("Give Genre's name:");
				String name = input.nextLine();
				user.SearchGenre(name);
			}
			if(w.equals("m")) {
				System.out.println("Give Movie's name:");
				String name = input.nextLine();
				user.SearchMovie(name);
			}
			if(w.equals("i")) {
				System.out.println("Give Movie's id:");
				String name = input.nextLine();
				int id = Integer.parseInt(name);
				user.SearchMovieID(id);
			}
			if(w.equals("t")) {
				System.out.println("Give Movie's name:");
				String name = input.nextLine();
				user.SearchTags(name);
			}
			if(w.equals("r")) {
				System.out.println("Give Movie's name:");
				String name = input.nextLine();
				user.SearchRatings(name);
			}
			System.out.println("In what type of file you want the answers?");
			System.out.println("Press p for pdf/t for txt/m for markdown/h for html");
			String file = input.nextLine();
			System.out.println("Give the path of the file:");
			String path = input.nextLine();
			if(w.equals("r")) {
				if(file.equals("p")){user.PrintPDFMovies(path);}
				else if(file.equals("t")) {user.PrintTXTRatings(path);}
				else if(file.equals("m")) {user.PrintMDRatings(path);}
				else if(file.equals("h")) {user.PrintHTMLRatings(path);}
			}
			else if(w.equals("t")) {
				if(file.equals("p")){user.PrintPDFMovies(path);}
				else if(file.equals("t")) {user.PrintTXTTags(path);}
				else if(file.equals("m")) {user.PrintMDTags(path);}
				else if(file.equals("h")) {user.PrintHTMLTags(path);}
			}
			else {
				if(file.equals("p")){user.PrintPDFMovies(path);}
				else if(file.equals("t")) {user.PrintTXTMovies(path);}
				else if(file.equals("m")) {user.PrintMDMovies(path);}
				else if(file.equals("h")) {user.PrintHTMLMovies(path);}
			}
			System.out.println("If you want to convert a txt file in pdf press y:");
			String con = input.nextLine();
			if(con.equals("y")) {
				System.out.println("Give the path of the old file:");
				String txt = input.nextLine();
				System.out.println("Give the path of the new file:");
				String pdf = input.nextLine();
				user.ConvertPDF(txt,pdf);
			}
			System.out.println("If you want to continue press 9, else press 0");
			String end = input.nextLine();
			if(end.equals("0")) {
				exit="0";
			}
			else {}
		}
	}
}

