public class ArithmeticOperation {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
    }

    public double divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        else{
            return (a/b);
        }
    }
}

