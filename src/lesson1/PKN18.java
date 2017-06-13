package lesson1;
//https://www.youtube.com/watch?v=ZHLdVRXIuC8&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=18
//instance of this object is Student.java class
public class PKN18 {

	public static void main(String[] args) {
		Student mark = new Student();//mark -> object or instance
		mark.id = 1;
		mark.name = "Mark";
		mark.age = 15;
		
		System.out.println(mark.name+" is "+mark.age+" years old.");
		
		Student tom = new Student();//tom -> object or instance
		tom.id = 2;
		tom.name = "Tom";
		tom.age = 14;
		
		System.out.println(tom.name+" is "+tom.age+" years old.");
		System.out.println("Below results using getters and setters. It should be the same");
		//above is discouraged. Better is use getters and setters and use encapsulation.
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		
		System.out.println(mark.getName()+" is "+mark.getAge()+" years old.");
		tom.setId(2);
		tom.setName("Tom");
		tom.setAge(14);
		
		System.out.println(tom.getName()+" is "+tom.getAge()+" years old.");
	
	}


}
