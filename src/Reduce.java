public class Reduce {
    public static void main(String[] args) {
        System.out.println(Reduction(100));
    }

    private static int Reduction(int n) {
        int count = 0;
        if (n == 0) {
            return 0;
        }
        else if (n % 2 == 1) {
            n = n - 1;
            count = 1 + Reduction(n);
        }
        else { // n % 2 == 0
            n = n / 2;
            count = 1 + Reduction(n);
        }
        return count;
    }
}
