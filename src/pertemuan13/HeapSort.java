package pertemuan13;

public class HeapSort {

    public static void main(String[] args) {
        //int[] a = {25, 57, 48, 37, 12, 92, 86, 33};
        int[] a = {92, 37, 86, 33, 12, 48, 57, 25};
        HeapResult result = heapSort(a);
        result.cetak();
    }

    private static HeapResult heapSort(int[] data) {
        int length = data.length;
        int[] treeHeap = createHeap(data);
        int[] result = treeHeap.clone();

        int penelusuran = 0;
        for(int i = length - 1; i >= 1; i--) {
            int temp = result[i];
            result[i] = result[0];
            int f = 0;
            int s;

            if(i == 1)
                s = -1;
            else
                s = 1;

            if(i > 2 && result[2] > result[1] )
                s = 2;

            while( s>=0 && temp < result[s] ) {
                result[f] = result[s];
                f = s;
                s = 2*f + 1;

                if(s+1 < i-1 && result[s] < result[s+1] )
                    s = s + 1;

                if(s > i-1)
                    s = -1;
            }
            result[f] = temp;

            penelusuran++;
        }
        System.out.println("Penelusuran: " + penelusuran);

        return new HeapResult(data, treeHeap, result);
    }

    private static int[] createHeap(int[] data) {
        int length = data.length;
        int[] treeHeap = data.clone();

        for(int i = 1; i <= length - 1; i++) {
            int temp = treeHeap[i];
            int s = i;
            int f = (s-1)/2;
            while( s>0 && treeHeap[f] < temp ) {
                treeHeap[s] = treeHeap[f];
                s = f;
                f=(s-1)/2;
            }
            treeHeap[s] = temp;
        }

        return treeHeap;
    }
}

class HeapResult {
    private final int[] origin;
    private final int[] treeHeap;
    private final int[] result;

    public HeapResult(int[] origin, int[] treeHeap, int[] result) {
        this.origin = origin;
        this.treeHeap = treeHeap;
        this.result = result;
    }

    public void cetak() {
        System.out.print("Origin: ");
        cetak(origin);

        System.out.print("Tree Heap: ");
        cetak(treeHeap);

        System.out.print("Sorted Heap: ");
        cetak(result);
    }

    private void cetak(int[] data) {
        for(int i : data) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}