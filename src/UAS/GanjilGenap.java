package UAS;

import java.util.Scanner;

public class GanjilGenap {
	   public static void main(String[] args) {
		        int[] angka = new int[5];
		        Scanner input = new Scanner(System.in);

		        System.out.println("Masukkan lima angka bilangan bulat:");

		        for (int i = 0; i < angka.length; i++) {
		            angka[i] = input.nextInt();
		        }

		        System.out.println("Angka-angka dalam array:");
		        tampilkanArray(angka);

		        System.out.println("Banyak elemen bilangan genap: " + hitungGenap(angka));
		        System.out.println("Banyak elemen bilangan ganjil: " + hitungGanjil(angka));
		    }

		    public static void tampilkanArray(int[] array) {
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		        System.out.println();
		    }

		    public static int hitungGenap(int[] array) {
		        int count = 0;
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] % 2 == 0) {
		                count++;
		            }
		        }
		        return count;
		    }

		    public static int hitungGanjil(int[] array) {
		        int count = 0;
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] % 2 != 0) {
		                count++;
		            }
		        }
		        return count;
		    }
}
