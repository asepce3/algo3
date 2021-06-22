package pertemuan12;

public class InsertionSort {

    public static void main(String[] args) {
        //int[] a = {15, 10, 17, 22, 7, 4, 13};
        //int[] b = {4, 7, 10, 13, 15, 17, 22};
        //int[] c = {22, 17, 15, 13, 10, 7, 4};

        int[] a = {19, 15, 10, 26, 3, 12, 7};
        int[] b = {3, 7, 10, 12, 15, 19, 26};
        int[] c = {26, 19, 15, 12, 10, 7, 3};

        InsertionResult resultA = insertionSort(a);
        InsertionResult resultB = insertionSort(b);
        InsertionResult resultC = insertionSort(c);

        resultA.cetak();
        resultB.cetak();
        resultC.cetak();
    }

    private static InsertionResult insertionSort(int[] data) {
        int length = data.length;
        int temp;
        int i;
        int ctrIf = 0;
        int ctrMove = 0;
        for (int k=1; k < length; k++) {
            temp = data[k];
            for (i = k; i >= 1; i--) {
                ctrIf++;
                if (data[i-1] > temp) {
                    ctrMove++;
                    data[i] = data[i-1];
                } else {
                    break;
                }
            }
            data[i] = temp;
        }
        return new InsertionResult(data, ctrIf, ctrMove);
    }
}

class InsertionResult {
    private int[] data;
    private int ctrIf;
    private int ctrMove;

    public InsertionResult(int[] data, int ctrIf, int ctrMove) {
        this.data = data;
        this.ctrIf = ctrIf;
        this.ctrMove = ctrMove;
    }

    public void cetak() {
        System.out.print("Data : ");
        for (int i : data) {
            System.out.print(i + ", ");
        }
        System.out.println("\nInstruksi if() : " + ctrIf);
        System.out.println("Instruksi move : " + ctrMove);
    }
}