package lesson1;
//Java Tutorial For Beginners 13 - Arrays in Java 
public class Arrays {
	public static void main(String[] args){
		int[] myintarray = {100,31,26,48,52};
		/*
		 int[] myIntArray = new int[3];
		 int[] myIntArray = {1,2,3};
		 int[] myIntArray = new int[]{1,2,3};
		 */
		int index = 0;
		while (index < 5){
			System.out.println(myintarray[index]);
		index++;
		}
	}
}
