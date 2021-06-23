package pertemuan13;

public class ShellSort {

    public static void main(String[] args) {
        //int[] a = {27, 25, 12, 32, 60, 52, 35, 37, 47, 17, 45, 10, 5, 15};
        //int[] a = {5, 10, 12, 15, 17, 25, 27, 32, 35, 37, 45, 47, 52, 60};
        int[] a = {60, 52, 47, 45, 37, 35, 32, 27, 25, 17, 15, 12, 10, 5};

        ShellResult result = shellSort(a);
        result.cetak();
    }

    private static ShellResult shellSort(int[] data) {
        int n;
        int x;
        int i;
        int ctrIf = 0;
        int ctrTrue = 0;

        for(int span = 5; span >= 1; span-=2) { //span = 5, 3, 1
            for(int awal=0; awal <= span-1; awal++) {
                n = 14;
                for(int k = awal+span ; k <= n-span; k=k+span) {
                    x = data[k];
                    for(i = k; i >= awal+span ; i=i-span ) {
                        ctrIf++;
                        if(data[i-span] > x ) {
                            data[i] = data[i-span]; ctrTrue++;
                        } else
                            break;
                    }
                    data[i]= x;
                }
            }
        }
        return new ShellResult(data, ctrIf, ctrTrue);
    }
}

class ShellResult {
    private int[] data;
    private int ctrIf;
    private int ctrTrue;

    public ShellResult(int[] data, int ctrIf, int ctrTrue) {
        this.data = data;
        this.ctrIf = ctrIf;
        this.ctrTrue = ctrTrue;
    }

    public void cetak() {
        for (int i : data) {
            System.out.print(i + ", ");
        }
        System.out.println("\nintruksi if(): " + ctrIf);
        System.out.println("intruksi if true: " + ctrTrue);
    }
}
