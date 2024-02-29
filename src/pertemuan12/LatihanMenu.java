package pertemuan12;

import java.util.Scanner;

public class LatihanMenu {
	
	/* 
	 * Buatlah program yang akan selalu menampilkan menu berikut :
	 * 
	 * 1. Internet
	 * 2. Sosmed
	 * 3. SMS&Telp
	 * 4. Info
	 * 99. Keluar 
	 * 
	 * Jika menekan 99 akan berhenti
	 */
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		int menu = 0;
		
		while (menu!= 99 ) {
			System.out.println("Silahkan pilih menu berikut :\n"
				+ "1. Internet\n"
				+ "2. Sosmed\n"
				+ "3. Sms&Telp\n"
				+ "4. Info\n"
				+ "99. Keluar");
			System.out.print("Menu yang anda pilih : ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1 : System.out.println("Masuk menu internet"); break;
			case 2 : System.out.println("Masuk menu sosmed"); break;
			case 3 : System.out.println("Masuk menu SMS&telp"); break;
			case 4 : System.out.println("Masuk menu informasi"); break;
			case 99 : System.out.println("Selamat tinggal"); break;
			default : System.out.println("Menu tidak tersedia"); break;
			}

		}
	}

}
