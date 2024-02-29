package pertemuan14;

import java.util.Scanner;

public class LatihanRecord {
	
	/*
	 * Record adalah struktur data, yang akan memungkinkan program mengelola banyak nilai, 
	 * tetapi nilai tersebut saling mengikat.
	 * Contohnya NRP akan terikat pada suatu nama mahasiswa saja, 
	 * nilai lainnya seperti ipk, semester dll.
	 * 
	 * Dimana dalam pembuatannya, record dalam java mengharuskan kita membuat 
	 * kelas baru yang dituliskan tanpa main method (tanpa public sttaic void main)
	 *
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		Buku bk = new Buku ();
		
		bk.inputNilai("Harry Potter", "Gramedia", "J.K Rowling", 300_000);
		
		System.out.println("Buku " +bk.getJudul() + " ditulis oleh "+
		bk.getPenulis() + " dijual dengan harga " + bk.getHarga());
		
		Buku bk2 = new Buku ();
		System.out.print("Masukan judul buku : ");
		String judul = sc.nextLine();
		System.out.print("Masukan penerbit buku : ");
		String penerbit = sc.nextLine();
		System.out.print("Masukan penulis buku : ");
		String penulis = sc.nextLine();
		System.out.print("Masukan harga buku : ");
		int harga = sc.nextInt();
		
		bk2.inputNilai(judul, penerbit, penulis, harga);
		System.out.println("Buku " +bk2.getJudul() + " diterbitkan oleh " + bk2.getPenerbit() + " ditulis oleh "+
				bk2.getPenulis() + " dijual dengan harga " + bk2.getHarga());
	}

}
