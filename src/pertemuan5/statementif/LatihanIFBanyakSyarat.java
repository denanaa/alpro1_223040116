package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFBanyakSyarat {
	
	public static void main (String [] args) {
		/*
		 * Statement IF adalah statement percabangan dengan satu kemungkinan 
		 * yang akan muncul
		 * formatnya :
		 * if (syarat 1) {
		 * 		// statement yang dieksekusi jika syarat 1 terpenuhi 
		 * } else if (syarat 2){
		 * 		// statement yang dieksekusi jika syarat 2 terpenuhi
		 * } else if (syarat 3){
		 * 		// statement yang dieksekusi jika syarat 3 terpenuhi
		 * }...else if (syarat n){
		 * 		// statement yang dieksekusi jika syarat n terpenuhi
		 * 
		 * Buatlah program yang akan menerima inputan keyboard dengan nilai
		 * bilangan bulat, lalu program akan mengecek dengan kondisi sbb :
		 * 1. Jika nilai >= 60  dan <= 100, maka dituliskan "anda lulus"
		 * 2. Jika nilai > 100, maka dituliskan "Critical Damage"
		 * 3. Jika nilai < 60, maka dituliskan "Silahkan Coba Lagi"
		 * 
		 */
		
		Scanner sc = new Scanner (System.in);
		int nilai;
		System.out.print("masukan nilai : ");
		nilai = sc.nextInt();
		
		if ((nilai>=60) && (nilai<=100)) {
			System.out.println("Anda Lulus");
		} else if (nilai>100){
			System.out.println("Critical Damage");
		} else if (nilai<60) {
			System.err.println("Silahkan Coba Lagi");
		}
		
	}

}
