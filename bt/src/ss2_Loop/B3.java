package ss2_Loop;

public class B3 {
    public static void main(String[] args) {
        for (int i = 3; i < 100 ; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int m = (int) Math.sqrt(n);
        for (int i = 2; i <=m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
