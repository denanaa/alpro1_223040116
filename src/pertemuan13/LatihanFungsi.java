package pertemuan13;

import java.util.Scanner;

public class LatihanFungsi {
	
	/*
	 * frungsi adalah salah satu method yng akan memiliki
	 * return value (mengeluarkan nilai), karena
	 * tipedata yang digunakan adalah tipedata yang sering
	 * kita gunakan  adalah tipedata yang sering 
	 * kita gunakan seperti String, int, double dkk,
	 * tipedata yang digunakan pada fungsi, disesuaikan 
	 * dengan nillai yang dikeluarkan fungsi tersebut
	 * 
	 * contoh :
	 * 
	 * Buatlah program hitung Body Mass Index dengan spesifikasi berikut :
	 * 1. terdapat fungsi input nama
	 * 2. terdapat fungsi hitung BMI dengan input Berat dan Tinggi 
	 * rumus BMI = berat(kg)/tinggi(meter)"
	 * 3. tampilkan hasil di main
	 * 
	 */
	
	static Scanner sc = new Scanner (System.in);
	
	public static String inputNama() {
		String nama;
		System.out.print("Masukan nama anda : ");
		nama = sc.nextLine();
		return nama;
	}
	
	public static double hitungBMI() {
		double berat, tinggi, bmi;
		System.out.print("Berat anda(kg) : ");
		berat = sc.nextDouble();
		System.out.print("Tinggi anda(m) : ");
		tinggi = sc.nextDouble();
		
		bmi = berat / (tinggi*tinggi);
		return bmi;
	}
	
	public static void main (String [] args) {
		String outputNama = inputNama();
		double hasilBMI = hitungBMI();
		System.out.print(outputNama + " memiliki bmi " + hasilBMI);
	}
}
