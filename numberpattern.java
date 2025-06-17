

public class numberpattern {
    public static void main(String[] args) {
        int n = 5;
        int number = n;
        for (int i = 0; i < n; i++) {
            int temp = number;
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.printf("%3s", temp);
                    temp = temp - (j + 2);
                } else {
                    System.out.printf("%3s", " ");
                }
            }

            System.out.println();
            number = number + (n - i - 1);
        }
    }
}
