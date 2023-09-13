public class Tester {

    public static void main(String[] args){
        Meat myBeef = new Meat(200, 95);
        myBeef.getCalories();
        System.out.println("Can I eat my food raw? " + myBeef.canEatRaw());

        Vegetable myVegie = new Vegetable(10, 150);
        myVegie.getCalories();
        System.out.println("Can I eat my food raw? " + myVegie.canEatRaw());
    }
}
