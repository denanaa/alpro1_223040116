package pertemuan9;

import java.util.Scanner;

public class PengulanganNama {
	
	/* Contoh soal
	 * Buatlah program yang akan menerima inputan nama user, lalu nama
	 * tersebut akan dimunculkan sebnyak 100 kali
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		String nama ;
		System.out.print("Masukan nama anda : ");
		nama = sc.next();
		
		for (int a=1; a <= 100 ; a++) {
			// 100 kali = himpunan 1 ... 100
			System.out.println(nama);
		}
		
	}

}
