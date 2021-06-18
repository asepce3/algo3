package pertemuan12;

/**
 * Menggabungkan dua buah array satu dimensi
 */
public class Merge {

    public static void main(String[] args) {
        int[] a = {5, 17, 20, 35, 37, 999};
        int[] b = {7, 10, 12, 20, 25, 27, 30, 999};
        int[] c = merge(a, b);
        for (int cc : c) {
            System.out.print(cc + ", ");
        }
    }


    private static int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[]c = new int[(a.length + b.length)-2];
        while(a[i] != 999 && b[j] != 999) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }

        while (a[i] != 999) {
            c[k] = a[i];
            k++;
            i++;
        }

        while(b[j] != 999) {
            c[k] = b[j];
            k++;
            j++;
        }

        return c;
    }
}
