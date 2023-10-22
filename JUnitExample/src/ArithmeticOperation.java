public class ArithmeticOperation {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
    }

    public double divide(double numerator, double denominator){
        if(denominator == 0){
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        else{
            return (numerator/denominator);
        }
    }
}

