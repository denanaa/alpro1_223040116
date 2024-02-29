package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIF {

	public static void main (String [] args) {
		/*
		 * Statement IF adalah statement percabangan dengan satu kemungkinan 
		 * yang akan muncul
		 * formatnya :
		 * if (boolean_expression) {
		 * 		// statement yang dieksekusi jika syarat terpenuhi 
		 * }
		 * buatlah program yang akan menerima inputan keyboard dengan nilai
		 * bilangan bulat, lalu program akan mengecek apakah nilai 
		 * tersebut >=60. Jika iya maka akan muncul statemen "anda lulus"
		 */
		
		Scanner sc = new Scanner (System.in);
		int nilai;
		System.out.print("masukan nilai : ");
		nilai = sc.nextInt();
		
		if (nilai>=60) {
			System.out.println("Anda Lulus!");
		/* else {
		 * System.err.println("Anda Tidak Lulus.");
		 */ 		
		}
		
	}
	
}
