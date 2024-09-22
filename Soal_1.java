import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("Selamat datang");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Pilih (0-3) : ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    persegi();
                    System.out.print("Press any key to continue...");
                    reader.read();
                    break;
                case 2:
                    persegiPanjang();
                    System.out.print("Press any key to continue...");
                    reader.read();
                    break;
                case 3:
                    lingkaran();
                    System.out.print("Press any key to continue...");
                    reader.read();
                    break;
                case 0:
                    System.out.println("Terimakasih Telah Berkunjung");
                    break;
                default:
                    System.out.println("Pilihan tidak terdaftar SILAHKAN COBA LAGI");
                    System.out.print("Press any key to continue...");
                    reader.read();
                    break;
            }
            System.out.println();
        } while (pilih != 0);
    }

    public static void persegi() {
        Scanner input = new Scanner(System.in);
        double sisi;
        System.out.print("Masukkan sisi persegi: ");
        sisi = input.nextDouble();
        System.out.println("Luas persegi: " + luasPersegi(sisi));
        System.out.println("Keliling persegi: " + kelilingPersegi(sisi));
    }

    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static void persegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang persegi panjang: ");
        double panjang = input.nextInt();
        System.out.print("Masukkan Lebar persegi panjang: ");
        double lebar = input.nextDouble();
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang(panjang, lebar));
        System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang(panjang, lebar));
    }

    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void lingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari jari lingkaran: ");
        double jarijari = input.nextInt();
        System.out.println("Luas lingkaran: " + luasLingkaran(jarijari));
        System.out.println("Keliling lingkaran: " + kelilingLingkaran(jarijari));
    }

    public static double luasLingkaran(double jarijari) {
        return Math.PI * jarijari * jarijari;
    }

    public static double kelilingLingkaran(double jarijari) {
        return 2 * Math.PI * jarijari;
    }
}