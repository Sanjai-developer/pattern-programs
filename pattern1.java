
public class pattern1 {
    // This program prints a pattern of stars in a diamond shape.  
        public static void main(String[] args) {
            int n = 5;

            int space = n - 1;
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < space; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.printf("* ");

                }

                System.out.println();
                space--;

            }

            space = 0;
            for (int i = n; i > 0; i--) {

                for (int j = 0; j < space; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.printf("* ");

                }

                System.out.println();
                space++;

            }
        }
    }


// Output:
//      *   
//     * *
//    * * *
//   * * * *
//  * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

