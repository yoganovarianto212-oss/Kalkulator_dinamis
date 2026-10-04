import java.util.Scanner;

public class Kalkulator_dinamis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("      KALKULATOR DINAMIS (Percobaan)");
            System.out.println("==============================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.println("==============================");

            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            if (pilihan == 5) {
                System.out.println("Program selesai.");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil;

            switch (pilihan) {

                case 1:
                    hasil = angka1 + angka2;
                    System.out.println("Hasil = " + hasil);
                    break;

                case 2:
                    hasil = angka1 - angka2;
                    System.out.println("Hasil = " + hasil);
                    break;

                case 3:
                    hasil = angka1 * angka2;
                    System.out.println("Hasil = " + hasil);
                    break;

                case 4:
                    if (angka2 == 0) {
                        System.out.println("Error: Tidak bisa dibagi 0!");
                    } else {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil = " + hasil);
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }

        input.close();
    }
}