package pertemuan13;

public class Soal1 {

    public static void main(String[] args) {
        int[] a = {58, 36, 47, 24, 10, 95, 88, 32};

        int i = 5;
        int x = a[i];
        int s = i;
        int f = (s-1) / 2;

        while(s > 0 && a[f] < x) {
            a[s] = a[f];
            s = f;
            f = (s-1) / 2;
        }

        a[s] = x;

        for (int nilai : a) {
            System.out.print(nilai + ", ");
        }
    }
}
