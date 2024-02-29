package pertemuan6;

import java.util.Scanner;

public class LatihanTernaryIF {

	/*
	 *  ternary if adalah bentuk lain dari statement if, dimana
	 *  merupakan bentuk singkat dari IF
	 *  
	 *  Format :
	 *  
	 *  [Tipedata] variable_penampung =(syarat)? "output TRUE" : "output FALSE"
	 *  
	 *  Contoh soal :
	 *  
	 *  Buatlah program dengan ternary of, dimana program akan menerima input nilai
	 *  IPK, lalu program akan melakukan pengecekan apakah IPK >= 2,75? jika iya 
	 *  maka muncul "Memenuhi syarat", jika tidak muncul "Mohon maaf"
	 */
	
public static void main (String [] args) {
	Scanner sInput = new Scanner (System.in);
	double dIPK;
	
	System.out.print("Masukan IPK anda : ");
	dIPK = sInput.nextDouble();
	
	String hasil = ((dIPK >= 3.00) && (dIPK <= 4.00))?  "Memenuhi Syarat" : ((dIPK >= 2.50) && (dIPK <=4.00)) ? "Perbaiki Lagi" : (dIPK > 4.00) ? "Error" : "Anda di DO";
	
	System.out.println(hasil);
			
 }
}
