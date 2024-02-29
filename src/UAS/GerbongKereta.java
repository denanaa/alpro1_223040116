package UAS;

import java.util.Scanner;

public class GerbongKereta {
    public static void main(String[] args) {
        String[] gerbong = {"Eksekutif 1", "Eksekutif 2", "Eksekutif 3", 
        		"Bisnis 1", "Bisnis 2", "Bisnis 3", "Bisnis 4"};

        System.out.println("Nama gerbong kereta api yang tersimpan dalam array:");

        for (String namaGerbong : gerbong) {
            System.out.println(namaGerbong);
        }
    }

}
