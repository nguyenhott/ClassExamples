public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fib(10));
        System.out.println(fibBetterRecursive(10));
        System.out.println(fibIterative(10));
    }

    public static long fibIterative(int n){

        long second = 0, first = 0, result = 1;
        int i = 1;
        while(i < n){
            second = first;
            first = result;
            result = first + second;
            i ++;
        }
        return result;
    }

    public static long fib(int n){
        if(n <= 1)
            return n;
        return (fib(n-1) + fib(n-2));
    }

    static long[] cache;
    public static long fibBetterRecursive(int n){
        long result;

        if (cache == null)
            cache = new long[n+1];

        if(n <= 1)
            return n;
        if(cache[n] != 0)
            return cache[n];
        result = fibBetterRecursive(n-1) + fibBetterRecursive(n-2);
        cache[n] = result;
        return result;

    }
}
