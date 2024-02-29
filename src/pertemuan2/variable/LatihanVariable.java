package pertemuan2.variable;

public class LatihanVariable {
	
	public static void main (String [] args) {
		/*
		 * format pembuatan variable
		 * [tipedata][namaVariable] = [nilai];
		 * variable bersifat replaceable (mudah diubah)
		 */

	String nama = "Nana";
	String nama2 = "Umar";//Nana di overwrite (timpa) dengan Umar
	System.out.println ("Nama saya" + nama2);
	//Jika ingin memanggil variable ke dalam statement gunaka  operator + (gabung)
	String nama3 = "Bagus";//Umar di overwrite (timpa) dengan Bagus
	System.out.println ("Nama saya" + nama3);
	
	String nrp = "223040116";
	System.out.println ("NRP saya" + nrp);
	}
}
