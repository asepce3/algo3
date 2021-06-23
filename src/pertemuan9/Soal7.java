package pertemuan9;

public class Soal7 {

    public static void main(String[] args) {
        int[] a = {15,10,12,25,10,27,30,10,25,14};

        int count = 0;
        for(int i=0; i<=9; i++) {
            if ( a[i]== 10 ) {
                count++;
                break;
            }
        }

        System.out.println(count);
    }
}
