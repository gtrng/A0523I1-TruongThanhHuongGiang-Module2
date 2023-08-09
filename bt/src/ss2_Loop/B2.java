package ss2_Loop;

public class B2 {
    public static void main(String[] args) {
        int dem = 0;
        int i = 2;
        while (dem < 20) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int m = (int) Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
