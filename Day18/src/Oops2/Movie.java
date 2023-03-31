package Oops2;

public class Movie { //polymorphism-method overloading
 public String theathre(int rating) {
	 if(rating>4) {
		 return "movie is good";
	 }
	 else {
		return  "movie is below average";
	 }}
	 public String theathre(String moviename) {
		 if(moviename.equals("nan e")) {
			 return "is correct";
		 }
		 else {
			 return "its not correct";
		 }
	 }
	 public static void main(String args[]) {
	 Movie t=new Movie();
	 
	 System.out.println(t.theathre(5));
	 System.out.println(t.theathre("nan e"));
	 }
}
