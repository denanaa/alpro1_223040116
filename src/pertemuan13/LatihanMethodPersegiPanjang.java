package pertemuan13;

import java.util.Scanner;

public class LatihanMethodPersegiPanjang {
	
	/*
	 * Buatlah program hitung luas persegi panjang dengan 
	 * menggunakan method berdasarkan spesifikasi 
	 * berikut :
	 * 1. terdapat prosedur input panjang dan lebar
	 * 2. terdapat prosedur hitung luas dan tampilakn hasil luasnya
	 * 
	 * terdapat dua macam variable :
	 * 1. variable lokal, yaitu variable yang dideklarasikan di dalam
	 * method (termasuk main) dampaknya variable tersbut tidak akan 
	 * dikenali oleh method yang lain
	 * 
	 * 2. variable global, yaitu variable yang dideklarasikan di dalam 
	 * class tetapi di luar method (termasuk main), sehingga semua method 
	 * di dalam kelas tersebut mengenalinya
	 */
	
	static int panjang, lebar; //conoth variable global 
	
	public static void inputNilai () {
		Scanner sc = new Scanner (System.in);
		//contoh variable lokal
		System.out.print("Panjang : ");
		panjang = sc.nextInt();
		System.out.print("Lebar : ");
		lebar = sc.nextInt();
	}
	
	public static void hitungLuas () {
		int luas;
		luas = panjang * lebar;
		System.out.println("Luas = " +luas);
		
	}
	
	public static void main (String [] args) {
		inputNilai();
		hitungLuas();
	}

}
