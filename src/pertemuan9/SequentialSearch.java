package pertemuan9;

import java.util.Scanner;

public class SequentialSearch {

    public static void main(String[] args) {
        int[] a = {15, 10, 12, 25, 10, 27, 30, 10, 25, 14};
        sequentialSearch(a);
    }

    private static void sequentialSearch(int[] data) {
        int length = data.length;
        boolean ditemukan = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("[Sequential Search]");
        System.out.print("Masukan angka yang akan dicari: ");
        int cari = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Ada");
        } else {
            System.out.println("Tidak ada");
        }
    }
}
