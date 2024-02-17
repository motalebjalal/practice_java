package practice;

public class FebonacciRecursion {
    public static void main(String[] args) {
        int febo = feboIn(8);
        System.out.println(febo);
    }

    private static int feboIn(int n) {
        //base case
        
        if (n <= 1)
            return n;
        int first = feboIn(n - 1);
        int second = feboIn(n - 2);
        return first + second;
    }
}
