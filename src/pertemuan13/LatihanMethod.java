package pertemuan13;

import java.util.Scanner;

public class LatihanMethod {
	
	/*
	 * method yang dikenal dengan prosedur atau fungsi adalah sebuah subprogram 
	 * yang merupakan bagian dari program yang dituliskan di dalam class,
	 * tetapi di luar main program
	 * 
	 * secara format method memiliki penulisan yang mirip dengan main, yaitu :
	 * 
	 * public static [tipe data] [namaMethod] (parameter) {
	 * 		//isi method (algoritme)
	 * 		return value (hanya function)
	 * }
	 * 
	 * tipe data yang digunakan pada method ini yang akan
	 * membedakan yang mana prosedur yang mana function 
	 * 
	 * dimana prosedur akan selalu menggunakan tipedata void, 
	 * yang artinya kosong, karena kosong sehingga tidak ada 
	 * return value
	 * contoh prosedur tampil nama :
	 * 
	 * public static void tampilNama (){
	 * 	system.out.println("Nama anda");
	 * }
	 * 
	 * Contoh soalnya 
	 * 
	 * Buatlah program yang akan menerima inputan keyboard untuk pengisian
	 * nama, lalu munculkan nama tersebut. dimana program tersebut harus 
	 * menggunakan prosedur
	 */
	
	//bisa dituliskan disini
	
	public static void main(String [] args) {
		//main program 
		tampilNama();
		}
	
	//bisa dituliskan disini
	public static void tampilNama () {
		Scanner sc = new Scanner (System.in);
		String nama;
		System.out.print("Masukan nama anda : ");
		nama = sc.nextLine();
		System.out.print("Selamat Datang, " +nama);
		
	}
}
