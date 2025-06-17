public class pattern2 {
    public static void main(String[] args) {
        // Online Java Compiler
        // Use this editor to write, compile and run your Java code online

        int n = 5;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }

            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

    }
}
