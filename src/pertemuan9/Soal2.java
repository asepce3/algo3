package pertemuan9;

public class Soal2 {

    public static void main(String[] args) {
        String x = "JAKARTANKRR";
        int y[] = new int[11];

        for (int i=0; i<=9; i++) {
            y[i] = 1;
            for (int j=i+1; j<=10; j++) {
                if (x.charAt(j) == x.charAt(i))
                    y[i]++;
            }
        }

        y[10] = 1;

        for (int i : y) {
            System.out.print(i + ", ");
        }
    }
}
