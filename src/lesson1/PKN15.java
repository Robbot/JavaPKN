package lesson1;
//https://www.youtube.com/watch?v=sliTbMkQBZ4&index=15&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al
public class PKN15 {
	public static void main(String[] args) {
		String myString = "Hello World";
		//display length of the myString (letters and space)
		int myStringLength = myString.length();
		System.out.println("Number of letters in string "+myString+" is "+myStringLength);
		
		//lower case conversion
		String myStringInLowerCase = myString.toLowerCase();
		//upper case conversion
		String myStringInUpperCase  = myString.toUpperCase();
		System.out.println(myStringInLowerCase+" "+myStringInUpperCase);
		
		//substition of letters
		System.out.println("Example of l replaced by b "+myString.replace('l', 'b'));
		//what place the letter occur for the first time
		System.out.println("At what place the letter l occurs for the first time "+myString.indexOf('l'));
	}
}
