package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFMultiSyarat {
	
	public static void main (String [] args) {
		/*
		 * Statemen IF adalah statemen percabangan dengan satu kemungkinan
		 * yang akan muncul
		 * formatnya :
		 * if ((syarat 1) AND/OR (syarat 2)) {
		 * 		// statement yang dieksekusi jika syarat terpenuhi
		 * }
		 * 
		 * Pengkondisian memungkinkan menggunakan syarat > 1
		 * dimana ada dua statement multi syarat:
		 * AND, berarti semua kondisi harus terpenuhi. &&
		 * OR, berarti cukup salah satu terpenuhi. ||
		 * 
		 * Buatlah program yang akan menerima inputan keyboard dengan nilai
		 * bilangan bulat, lalu program akan mengecek apakah nilai
		 * tersebut diantara nilai 60-100. Jika iya maka akan muncul
		 * statement " anda memenuhi syarat"
		 * 
		 */
		
		Scanner sc = new Scanner (System.in);
		int nilai;
		System.out.print("masukan nilai : ");
		nilai = sc.nextInt();
		
		if ((nilai>=60) && (nilai<=100)) {
			System.out.println("Anda Memenuhi Syarat");
		/*
		 * else {
		 * System.err.println("Anda Tidak Memenuhi Syarat");
		 */
			
		}
	}
	

}
