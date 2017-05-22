package lesson1;
//https://www.youtube.com/watch?v=z-QgsXkYqjc&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&index=14
public class PKN14 {

	public static void main(String[] args) {
		
		int[] myintarray = {100,31,26,48,52};
			for(int index=0; index<5; index++){
				System.out.println(myintarray[index]);
		}
		//The other much quicker method for listing elements in array
			for(int element : myintarray){
					System.out.println(element);
			}
	}

}
