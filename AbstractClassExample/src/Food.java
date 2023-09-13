public abstract class Food {
    double fatPercent;
    double fiberPercent;
    double calories;

    public void getCalories(){
        System.out.println("Your meal has " + calories + " Kcal");
    }

    public abstract boolean canEatRaw();
}
