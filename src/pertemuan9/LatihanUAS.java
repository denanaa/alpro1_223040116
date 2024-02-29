package pertemuan9;

public class LatihanUAS {
	    public static void main(String[] args) {
	        int baris = 3;
	        int kolom = 4;

	        // Menggunakan pernyataan pengulangan for
	        System.out.println("Menggunakan pernyataan pengulangan for:");
	        for (int i = 0; i <= baris; i++) {
	            for (int j = i; j < i + kolom; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        // Menggunakan pernyataan pengulangan while
	        System.out.println("Menggunakan pernyataan pengulangan while:");
	        int i = 0;
	        while (i <= baris) {
	            int j = i;
	            while (j < i + kolom) {
	                System.out.print(j + " ");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	    }
}
