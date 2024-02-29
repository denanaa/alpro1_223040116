package UAS;

public class CompareSegitiga {
    static void compare(Segitiga S1, Segitiga S2) {
        // Membandingkan nilai Luas Segitiga S1 dan Luas Segitiga S2
        double luasS1 = S1.hitungLuas();
        double luasS2 = S2.hitungLuas();

        if (luasS1 > luasS2) {
            System.out.println("Luas Segitiga A lebih besar dari Luas Segitiga B");
        } else if (luasS1 < luasS2) {
            System.out.println("Luas Segitiga B lebih besar dari Luas Segitiga A");
        } else {
            System.out.println("Luas Segitiga A sama dengan Luas Segitiga B");
        }
    }

    public static void main(String[] args) {
        Segitiga A = new Segitiga();
        System.out.println("Segitiga A");
        A.bacaSegitiga();
        A.tulisSegitiga();
        System.out.println("Luas: " + A.hitungLuas());

        Segitiga B = new Segitiga();
        System.out.println("Segitiga B");
        B.bacaSegitiga();
        B.tulisSegitiga();
        System.out.println("Luas: " + B.hitungLuas());

        // Memanggil method compare
        compare(A, B);
    }
}
