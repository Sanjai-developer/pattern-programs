
public class numberpattern2 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 0; i < n; i++) {
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                row[j] = count++;
            }
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.printf("%3s", row[j]);
                }

            } else {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3s", row[j]);
                }
            }
            System.out.println();
        }

    }
}
