package pertemuan11;

import java.util.Scanner;

public class LoopGame {
	
	/* 
	 * Game dimana darah awal pemain adalah 100, selama darah > 0 maka
	 * game akan meminta pemain memasukan nilai serangan.
	 * dimana nilai serangan tersebut akan mengurangi darah pemain.
	 * jika darah pemain = 0, maka permainan berakhir
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int darah, serangan;
		
		darah = 100;
		
		while (darah > 0) {
			System.out.print("Masukan serangan : ");
			serangan = sc.nextInt();
			
			darah = darah - serangan;
			System.out.println("Darah sekarang :" + darah);
			if (darah  <= 0) {
					System.out.println("Game Over");
					break;
			}
		}
	}

}
