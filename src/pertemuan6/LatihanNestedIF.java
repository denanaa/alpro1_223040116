package pertemuan6;

import java.util.Scanner;

public class LatihanNestedIF {

	/*
	 * Nested IF adalah bentuk percabangan dengan statemnt if,
	 * dimana akan ada if (child) di dalam if lainnya (Parentnya)
	 * 
	 * formatnya :
	 * if (syarat 1) {
	 * 		//jika memenuhi syarat1
	 * 		if (syarat a) {
	 * 			//jika memenuhi syarat a
	 * 		} else if (syarat b){
	 * 			//jika memenuhi syarat b
	 * 		} ... //hingga syarat ke-....
	 * } else { 
	 * 		//jika tidak memenuhi syarat
	 * }
	 * 
	 * contoh soal :
	 * Buatlah program penerimaan siswa fi TK Motekar, dimana program akan
	 * menerima inputan usia anak
	 * terdapat syarat yaitu :
	 * 1. anak yang diterima adalah siswa yang memiliki umur 5-7 tahun, jika
	 * maka akan ada syart berikutnya :
	 * a. Jika anak berumur 5 tahun, maka akan muncul "Kelas A"
	 * B. Jik anak berumur 6-7 tahun, maka akan muncul "Kelas B"
	 * 
	 * 2. Selain umur 5-7 tahun maka akan ditolak
	 */
	
public static void main (String [] args) {
	Scanner scanInput = new Scanner (System.in);
	int umur;
	
	System.out.print("Masukan umur anak : ");
	umur = scanInput.nextInt();
	
	if((umur>=5 && umur<=7)) {
		System.out.println("Diterima");
		if (umur == 5) {
			System.out.println("Masuk Kelas A");
		} else {
			System.out.println("Masuk Kelas B");
		}
	 } else {
		 System.err.println("Maaf anda tidak diterima");
	 }
   }
}
