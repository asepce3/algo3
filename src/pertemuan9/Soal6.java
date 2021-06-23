package pertemuan9;

public class Soal6 {

    public static void main(String[] args) {
        int[] A = {15,10,12,25,10,27,30,10,25,14};

        int countFlag = 0;
        int flag = 0;
        for( int I=0; I<=9; I++ ) {
            if ( A[I] == 25 ) {
                countFlag++;
                flag = 1;
            }
        }

        System.out.println(countFlag);
    }
}
