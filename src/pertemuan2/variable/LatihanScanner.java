package pertemuan2.variable;

import java.util.Scanner;

public class LatihanScanner {
	
	public static void main (String[] args) {
		/*
		 * Scanner adalah salah satu fungsi untuk menerima inputan
		 * fungsinya akan menyesuaikan dengan tipedata variablenya
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Nama   : ");
		String sNama = sc.next(); // next() digunakan untuk String
		
		System.out.print("Umur   : ");
		int iUmur = sc.nextInt(); // nextInt() digunakan untuk int
		
		System.out.print("IPK    : ");
		double dIPK = sc.nextDouble(); // nextDouble() digunakan untuk double
		
		System.out.println("Nama saya " + sNama + " dengan umur " + iUmur + " memiliki IPK " + dIPK);
	}

}
