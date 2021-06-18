package pertemuan12;

public class BubbleSort {

    public static void main(String[] args) {
        //int[] a = {151, 10, 7, 22, 17, 5, 121};
        int[] a = {19, 15, 10, 26, 3, 12, 7};
        SortResult sortedA = bubbleSort(a);
        sortedA.cetak();

        //int[] b = {5, 7, 10, 12, 15, 17, 22};
        int[] b = {3, 7, 10, 12, 15, 19, 26};
        SortResult sortedB = bubbleSort(b);
        sortedB.cetak();

        //int[] c = {22, 17, 15, 12, 10, 7, 5};
        int[] c = {26, 19, 15, 12, 10, 7, 3};
        SortResult sortedC = bubbleSort(c);
        sortedC.cetak();
    }

    private static SortResult bubbleSort(int[] a) {
        int length = a.length;
        int ifNumber = 0;
        int swapNumber = 0;

        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                ifNumber++;
                if (a[j] > a[j+1]) {
                    swapNumber++;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return new SortResult(ifNumber, swapNumber, a);
    }
}

class SortResult {
    private final int ifNumber;
    private final int swapNumber;
    private final int[] sorted;

    public SortResult(int ifNumber, int swapNumber, int[] sorted) {
        this.ifNumber = ifNumber;
        this.swapNumber = swapNumber;
        this.sorted = sorted;
    }

    public void cetak() {
        for (int aa : sorted) {
            System.out.print(aa + ", ");
        }
        System.out.println("\nJumlah if : " + ifNumber);
        System.out.println("Jumlah swap : " + swapNumber);
    }
}
