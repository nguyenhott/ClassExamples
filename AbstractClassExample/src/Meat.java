public class Meat extends Food{

    public Meat(double fat, double fiber){
        fatPercent = fat;
        fiberPercent = fiber;
        calories = fat * 150 + fiber * 100;
    }
    @Override
    public boolean canEatRaw() {
        return false;
    }
}
