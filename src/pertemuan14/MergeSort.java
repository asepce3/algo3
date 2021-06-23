package pertemuan14;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {25, 12, 37, 15, 20, 45, 17, 5, 27, 7, 32};

        System.out.print("Sebelum di sorting: ");
        cetak(a);
        mergeSort(a);

        System.out.print("\nSetelah di sorting: ");
        cetak(a);
    }

    private static void cetak(int[] data) {
        for(int nilai : data) {
            System.out.print(nilai + ", ");
        }
    }

    private static void mergeSort(int[] data) {
        int[] aux = new int[data.length];
        int length = data.length;
        int size = 1;

        while (size < length) {
            int l1 = 0;
            int k = 0;
            while (l1 + size < length) {
                int l2 = l1 + size;
                int u1 = l2 - 1;
                int u2;
                if(l2+size-1 < length)
                    u2 = l2 + size-1;
                else
                    u2 = length - 1;

                int i = l1;
                int j = l2;
                while(i <= u1 && j <= u2) {
                    if(data[i] <= data[j])
                        aux[k] = data[i++];
                    else
                        aux[k] = data[j++];

                    k++;
                }

                while(i <= u1) {
                    aux[k] = data[i];
                    i++;
                    k++;
                }

                while(j <= u2) {
                    aux[k] = data[j];
                    j++;
                    k++;
                }
                l1 = u2+1;
            }

            for(int i = l1; k < length; i++) {
                aux[k++] = data[i];
            }

            System.arraycopy(aux, 0, data, 0, length);

            size *= 2;
        }
    }
}
