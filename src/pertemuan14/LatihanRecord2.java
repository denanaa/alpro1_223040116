package pertemuan14;

import java.util.Scanner;

public class LatihanRecord2 {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		Mahasiswa mhs = new Mahasiswa ();
		
		mhs.inputNilai("223040116", "Dena", 90, 3.92);
		
		System.out.println("Mahasiswa dengan NRP " +mhs.getNRP() + " bernama "+
		mhs.getNama() + " memiliki nilai " + mhs.getNilai() + " dan mendapatkan IPK " + mhs.getIPK());
		
		Mahasiswa mhs2 = new Mahasiswa();
		System.out.print("Masukan NRP anda : ");
		String NRP = sc.nextLine();
		System.out.print("Masukan nama anda : ");
		String nama = sc.nextLine();
		System.out.print("Masukan nilai anda : ");
		int nilai = sc.nextInt();
		System.out.print("Masukan IPK anda : ");
		double IPK = sc.nextDouble();
		
		mhs2.inputNilai(NRP, nama, nilai, IPK);
		System.out.println("Mahasiswa dengan NRP " +mhs2.getNRP() + " bernama "+
				mhs2.getNama() + " memiliki nilai " + mhs2.getNilai() + " dan mendapatkan IPK " + mhs2.getIPK());
	}
}
