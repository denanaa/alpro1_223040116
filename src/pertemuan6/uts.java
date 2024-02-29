package pertemuan6;

import java.lang.reflect.Array;
import java.util.Scanner;
public class uts {
	
	public static void main(String[] args)
	{
		Array arr = new Array ();
		arr.run();
	}

	public void run ()
	{
		// Membuat array
		int[] arr;
		arr = new int[5];
		
		// Assignment array
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		
		// Mengambil array
		System.out.printf("%d \n", arr[0]);
		System.out.printf("%d \n", arr[1]);
		System.out.printf("%d \n", arr[2]);
	}
}