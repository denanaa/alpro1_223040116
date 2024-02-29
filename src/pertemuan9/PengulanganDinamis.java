package pertemuan9;

import java.util.Scanner;

public class PengulanganDinamis {
	
	/* 
	 * Contoh soal
	 * Buatlah program pengulangan teukur positif, dimana
	 * nilai awal pengulangan adalah 1. dan nilai akhir
	 * pengulangan adalah nilai yang diinput user.
	 * 
	 * note : Pengulangan positif adalah pengulangan yang
	 * nilai awal < dari nilai akhir, sehingga mengubahnya +
	 * 
	 * pengulangan negatif adalah pengulangan yang
	 * nilai awal > nilai akhir, sehingga mengubahnya -																								
	 * 	
	 */

	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int akhir ;
		System.out.print("Masukan nilai akhir pengulangan : ");
		akhir = sc.nextInt ();
		
		for(int loop = 1; loop <= akhir; loop++) {
			System.out.println(loop);
		}
	}
}
