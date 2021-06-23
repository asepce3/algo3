package pertemuan10;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {5, 7, 12, 15, 17, 19, 22, 25, 27, 32};
        binarySearch(a);
    }

    private static void binarySearch(int[] data) {
        int length = data.length;
        int begin = 0;
        int middle;
        int end = length - 1;
        int flag = 0;

        int jumlahPotong = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka yang dicari: ");
        int cari = scanner.nextInt();
        while (begin <= end && flag == 0) {
            middle = (begin + end) / 2;
            jumlahPotong++;
            if (cari == data[middle]) {
                flag = 1;
            } else {
                if (cari < data[middle]) {
                    end = middle - 1;
                } else {
                    begin = middle + 1;
                }
            }
        }

        System.out.println("Jumlah potong: " + jumlahPotong);
        if (flag == 1) {
            System.out.println("Ada");
        } else {
            System.out.println("Tidak ada");
        }
    }
}
