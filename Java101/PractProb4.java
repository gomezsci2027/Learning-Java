
//problem 4
public class PractProb4 {
static int n = 4;
    public static int fib(int n) {
        if (n<=1) {
            return n;
        }

        int x = 0;
        int y = 1;

        for (int i=2; i <= n; i++) {
            int z = x + y;
            x=y;
            y=z;
        }
        return y;

    }
    public static void main(String[] args) {
       System.out.println (fib(n));
    }
}