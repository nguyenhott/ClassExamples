import java.util.ArrayList;

public class FactoryExample {
    public static void main(String[] args) {

        IntegerPrinter printer = new IntegerPrinter(5);
        printer.print();

        DoublePrinter printer1 = new DoublePrinter(10.5);
        printer1.print();

        StringPrinter printer2 = new StringPrinter("Hello");
        printer2.print();

        Printer<Integer> printer3 = new Printer<>(5);
        printer3.print();

        Printer<Double> printer4 = new Printer<>(10.5);
        printer4.print();

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Kitty");
        myArrayList.add("Nana");
        System.out.println(myArrayList);

        produce("produce string");
        produce(5);


        produceList(myArrayList);

    }

    public static <T> void produce(T t){

        System.out.println(t);
    }

    public static void produceList(ArrayList<?> l){

        System.out.println(l);

    }

}

class Printer<E>{

    E product;

    public Printer(E i){
        product = i;
    }

    void print(){
        System.out.println(product);
    }

}

class IntegerPrinter{
    Integer product;

    public IntegerPrinter(Integer i){
        product = i;
    }

    void print(){
        System.out.println(product);
    }
}

class DoublePrinter{
    Double product;

    public DoublePrinter(Double i){
        product = i;
    }

    void print(){
        System.out.println(product);
    }
}

class StringPrinter{
    String product;

    public StringPrinter(String i){
        product = i;
    }

    void print(){
        System.out.println(product);
    }
}