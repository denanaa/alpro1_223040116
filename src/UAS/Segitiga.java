package UAS;

import java.util.Scanner;

public class Segitiga {
	double alas, tinggi, luas;

    void bacaSegitiga() {
        Scanner sc = new Scanner(System.in);

        // Mengisi variabel alas dengan inputan dari sc
        System.out.print("Masukkan nilai alas: ");
        alas = sc.nextDouble();

        // Mengisi variabel tinggi dengan inputan dari sc
        System.out.print("Masukkan nilai tinggi: ");
        tinggi = sc.nextDouble();
    }

    void tulisSegitiga() {
        System.out.println("Alas = " + alas + ", Tinggi = " + tinggi);
    }

    double hitungLuas() {
        // Menghitung nilai luas dengan rumus 1/2 x alas x tinggi
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.bacaSegitiga();
        segitiga.tulisSegitiga();
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
    }

}
