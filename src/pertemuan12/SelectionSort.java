package pertemuan12;

public class SelectionSort {

    public static void main(String[] args) {
//        int[] a = {15, 10, 17, 22, 7, 4, 13};
//        int[] b = {4, 7, 10, 13, 15, 17, 22};
//        int[] c = {22, 17, 15, 13, 10, 7, 4};
        int[] a = {19, 15,  10, 26, 3, 12, 7};
        int[] b = {3, 7, 10, 12, 15, 19, 26};
        int[] c = {26, 19, 15, 12, 10, 7, 3};

        SelectionResult resultA = selectionSort(a);
        SelectionResult resultB = selectionSort(b);
        SelectionResult resultC = selectionSort(c);

        System.out.println("a");
        resultA.cetak();
        resultB.cetak();
        resultC.cetak();
    }

    private static SelectionResult selectionSort(int[] a) {
        int length = a.length;
        int ifNumber = 0;
        int ifTrueNumber = 0;

        for (int k=0; k <= length-2; k++) {
            int j = k;
            for (int i=k+1; i <= length-1; i++) {
                ifNumber++;
                if (a[i] < a[j]) {
                    ifTrueNumber++;
                    j = i;
                }
            }
            int temp = a[j];
            a[j] = a[k];
            a[k] = temp;
        }

        return new SelectionResult(ifNumber, ifTrueNumber, a);
    }
}

class SelectionResult {
    private final int ifNumber;
    private final int ifTrueNumber;
    private final int[] sorted;

    public SelectionResult(int ifNumber, int ifTrueNumber, int[] sorted) {
        this.ifNumber = ifNumber;
        this.ifTrueNumber = ifTrueNumber;
        this.sorted = sorted;
    }

    public void cetak() {
        for (int i : sorted) {
            System.out.print(i + ", ");
        }
        System.out.println("\nJumlah if : " + ifNumber);
        System.out.println("Jumlah if true : " + ifTrueNumber);
    }
}
