package lesson1;
//https://www.youtube.com/watch?v=c7iU8ZFA9gQ&index=17&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al
public class PKN17 {

	public static void main(String[] args) {
		sayHello("John");
		sayHello("Tom");
		sayHello("Mark");
		sayHello("Tim");
		//example of call function back
		add (5,23);
		//example of return
		int sum = returnAdd(12,34,65);
		System.out.println(sum);
		
	}
	
	public static void sayHello(String name){
		System.out.println("Hello "+name);
	}
	public static void add(int a, int b){
		System.out.println(a+b);
	}
	public static int returnAdd(int a, int b, int c){
		return (a+b+c);
	}


}
