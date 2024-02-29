package pertemuan12;

import java.util.Scanner;

public class NestedLoop1 {
	
	/* Buatlah program yang menghasilkan output sebagai berikut 
	 * 
	 * *****
	 * *****
	 * *****
	 * *****
	 * *****
	 */
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int loop;
		
		System.out.print("masukan baris yang anda inginkan : ");
		loop = sc.nextInt();
		
		for (int bar=1; bar <= loop; bar++) {
			for (int kol=1; kol <= loop; kol++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
