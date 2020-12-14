package by.academy.homework5;

public class Task6 {

	public static void main(String... args){
		
		int[] arr;
		arr = new int [8];
		
		try {
		int j = 1;
		for(int i = 0; i < 10; i++) {
			arr[i] = j;
			j++;
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array is to small, expand the array");
					
		}
	}

}