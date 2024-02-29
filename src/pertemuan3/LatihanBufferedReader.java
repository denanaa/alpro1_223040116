package pertemuan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LatihanBufferedReader {

	public static void main (String [] args) {
		/*
		 * Selain Scanner terdapat fungsi lain untuk input keyboard 
		 * BufferedReader adalah fungsi lain yang dapat kita gunakan
		 * Kelebihan dari BufferedReader adalah :
		 * 1. Kapasitas lebih besar (8kb), sehingga dapat menerima inputan spasi
		 * 2. Menggunakan try catch sehingga lebih aman dalam menanangani error manusia 
		 * 
		 * Kekurangan adalah Utility hanya menerima inputan String 
		 * sehingga harus melakukan konvert untuk tipe data lainnya
		 */
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		try { //untuk kondisi normal
			System.out.print("Nama : ");
			String sNama = br.readLine();
			
			System.out.print("Nilai : ");
			int iNilai = Integer.parseInt(br.readLine());
			
			/*
			 * readline bertipe data String
			 * sehingga untuk integer perlu di konvert
			 * Integer.parseInt() adalah fungsi konvert ke Int
			 * Double.parseDouble() fungsi konvert ke double
			 */
		}
		catch (Exception e){ //untuk kondisi yang error 
			System.err.println("Masukan nilai dengan angka");
		}
		
	}
}
