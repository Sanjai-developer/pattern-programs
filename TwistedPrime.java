

public class TwistedPrime {

        public static void main(String[] args) {
            int n = 97;
            int j = (n % 10) * 10 + (n / 10);

            if (prime(j)) {

                System.out.printf("true : %3s", j);
            } else {
                System.out.printf("false");
            }

        }

        static boolean prime(int n) {
            if (n == 1 || n == 0)
                return false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
