package pertemuan11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSearch {

    public static void main(String[] args) {
        int[] a = {0, 5, 7, 12, 15, 17, 19, 22, 25, 27, 32, 35, 37, 40, 45, 53};
        fibonacciSearch(a);
    }

    private static void fibonacciSearch(int[] data) {
        int length = data.length - 1;
        int f0 = 1;
        int f1 = 1;
        int fibo = 1;
        int j = 0;

        List<Integer> fiboNumbers = new ArrayList<>();
        while (fibo <= length + 1) {
            fiboNumbers.add(fibo);
            fibo = f0 + f1;
            f0 = f1;
            f1 = fibo;
            j++;
        }

        int s = j - 1;
        int fk = fiboNumbers.get(s);
        int i = fiboNumbers.get(s-1);
        int p = fiboNumbers.get(s-2);
        int q = fiboNumbers.get(s-3);

        int m = (length + 1) - fk;

        System.out.print("Masukan nilai yang dicari: ");
        Scanner scanner = new Scanner(System.in);
        int cari = scanner.nextInt();

        if (cari > data[i]) {
            i += m;
        }

        int flag = 0;
        int t;
        int pencarianKe = 0;
        while(i != 0 && flag == 0) {
            if (cari == data[i])
                flag = 1;
            else {
                if (cari < data[i]) {
                    if (q == 0) {
                        i = 0;
                    } else {
                        i -= q;
                        t = p;
                        p = q;
                        q = t - q;
                    }
                } else {
                    if (p == 1)
                        i = 0;
                    else {
                        i += q;
                        p -= q;
                        q -= p;
                    }
                }
            }
            System.out.println("Pencarian ke : " + ++pencarianKe);
        }

        if (flag == 1) {
            System.out.println("\nditemukan");
        } else {
            System.out.println("\ntidak ditemukan");
        }
    }
}
