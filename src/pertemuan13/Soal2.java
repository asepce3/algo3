package pertemuan13;

public class Soal2 {

    public static void main(String[] args) {

        int[] a = {58, 36, 47, 32, 10, 24, 88, 95};

        int i = 5;
        int temp = a[i];
        a[i] = a[0];
        int f = 0;
        int s;

        if(i == 1)
            s = -1;
        else
            s = 1;

        if(i > 2 && a[2] > a[1] )
            s = 2;


        while( s >= 0 && temp < a[s] )
        { a[f] = a[s];
            f = s;
            s = 2 * f + 1;

            if(s + 1 < i - 1 && a[s] < a[s+1] )
                s = s + 1;
            if(s > i-1)
                s = -1;
        }

        a[f] = temp;

        for (int nilai : a) {
            System.out.print(nilai + ", ");
        }
    }
}
