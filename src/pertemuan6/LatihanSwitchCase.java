package pertemuan6;

import java.util.Scanner;

public class LatihanSwitchCase {

	/*
	 * Switch case adalah statement lain dalam struktur kontrol percabangan
	 * dimana digunakan untuk pengkondisian yang berturut seperti  menu
	 * 
	 * formatnya :
	 * switch (Variabel_dicek) {
	 * 		case a : // syarat a
	 * 				break;
	 * 		case b : // syarat b
	 * 				break;
	 * 		...
	 * 		case n : // syarat n
	 * 				break;
	 * 		default : // jika inputan tidak dikenali
	 * 				break;
	 * }
	 * 
	 * contoh :
	 * Buatlah program untuk menerima input layanan *123# dalam suatu operator,
	 * dimana menunya adalah:
	 * 1. Paket Internet
	 * 2. Paket Sosmed
	 * 3. Paket Telp/SMS
	 */
	
public static void main (String [] args) {
	
	Scanner sc = new Scanner (System.in);
	int input;
	System.out.println("Silahkan pilih menu :\n"
			+" 1. Paket Internet\n"
			+" 2. Paket Sosmed\n"
			+" 3. Paket Telp/SMS\n");
	
	System.out.print("Masukan menu yang anda pilih : ");
	input = sc.nextInt();
	
	switch (input) {
	case 1 : System.out.println("Masuk Paket Internet"); break;
	case 2 : System.out.println("Masuk Paket Sosmed"); break;
	case 3 : System.out.println("Masuk Paket Telp/SMS"); break;
	default : System.out.println("Input tidak dikenali"); break;
	}
	
  }
}
