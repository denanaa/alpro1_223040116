package pertemuan14;

public class Buku {
	
	/*
	 * ini adalah record Buku, dinamakan kelas buku karena akan menangani nilai dari objek buku
	 * 
	 * atribut adalah nilai-nilai yang dimiliki dari objek 
	 * yang akan kita tangani, karena buku memiliki nilai seperti judul, penerbit,
	 * pengarang, genre, harga, dll. maka atribut yang ada pada kelas buku mengikuti nilai tersebut
	 * 
	 * atribut akan berbentuk variable global dalam kelas record
	 * 
	 */
	
	String sJudul;
	String sPenerbit;
	String sPenulis;
	int iHarga;
	
	/*
	 * Record harus memiliki method (prosedur atau fungsi) yang digunakan
	 * untuk memasukkan nilai ke atribut dan memunculkan nilai dari atribut 
	 */
	
	public void inputNilai (String judul, String penerbit, String penulis, int harga) {
		//parameter adalah variable yang akan menerima inputan nilai dari pemanggil
		sJudul = judul;
		sPenerbit = penerbit;
		sPenulis = penulis;
		iHarga = harga;
	}
	
	public String getJudul () {
		return sJudul;
	}
	public String getPenerbit () {
		return sPenerbit;
	}
	public String getPenulis () {
		return sPenulis;
	}
	public int getHarga () {
		return iHarga;
	}

}
