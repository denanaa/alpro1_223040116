package pertemuan9;

public class PengulanganForDasar {

	/*
	 * Pengulangan for adalah pengulangan yang terukur 
	 * karena sudah jelas awal dan akhir pengulangan.
	 * Terdapat 3 blok penting dalam statement FOR, yaitu :
	 * 1. start, nilai awal pengulangan
	 * 2. Finish, syarat pengulangan terjadi
	 * 3. Pengubah, proses increment atau decrement
	 * 
	 * Dimana, format dari FOR adalah :
	 * 
	 * for (start; finish; pengubah) {
	 *		// statement yang berulang
	 *}
	 *
	 * Contoh Kasus
	 * Buatlah program yang akan menampilkan nilai dari 1 sampai 10 
	 * dan program yang akan menampilkan nilai dari 20 sampai 11
	 */
	
	
	public static void main (String [] args) {
		
		System.out.println("pengulangan 1 - 10");
		for (int nilai = 1; nilai <= 10; nilai++ ) {
			System.out.println(nilai + "\n");
		}
		System.out.println("pengulangan 20 - 11");
		for (int nilai = 20; nilai > 10; nilai-- ) {
			System.out.println(nilai + "\n");
		}
	}
}
