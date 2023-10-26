public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
        System.out.println(powerIterative(2, 5));
        printRecursive(100000); //stack overflow
    }

    public static void printRecursive(int number){

        if(number == 0)
            return;
        System.out.println(number);
        printRecursive(number-1);
    }

    public static double powerIterative(double n, int p){
        double result = 1;
        for(int i = 0; i < p; i++){
            result = result * n;
        }
        return result;
    }
    public static double power(double n, int p){
        if(p == 0)
            return 1;
        return (n * power(n, p-1));
    }
}