package pertemuan3;

public class OperatorIncreament {

	public static void main (String [] args) {
		/*
		 * dalam pemrograman ada operator increament dan decreament
		 * 1. increament akan digunakan untuk proses +1 menggunakan ++
		 * 2. decreament akan digunakan untuk proses -1 mengguanak --
		 * 
		 * dalam penggunaannya akan memiliki dua jenis yaitu 
		 * 1. prefix, operator dituliskan sebelum operand
		 * contoh : ++a
		 * 2. postfix, operator dituliskan setelah operand
		 * contoh : a++
		 */
		
		int a = 10;
		System.out.println("nilai awal -> " +a);//10
		System.out.println("prefix -> "+ (++a));//11
		System.out.println("postfix -> "+ (a++));//11
		System.out.println("nilai akhir -> " +a);//12
		
		System.out.println("nilai awal -> " +a);//12
		System.out.println("prefix -> "+ (--a));//11
		System.out.println("postfix -> "+ (a--));//11
		System.out.println("nilai akhir -> " +a);//10
	}
}
