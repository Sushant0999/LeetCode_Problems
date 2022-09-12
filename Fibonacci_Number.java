//Link : https://leetcode.com/problems/fibonacci-number/
public class Fibonacci_Number {
    //Driver Code
    public int fib(int n) {
        if(n == 1 || n == 0)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
