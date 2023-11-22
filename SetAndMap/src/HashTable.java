import java.util.Hashtable;
public class HashTable{
    public static void main(String[] args){

        Hashtable<String, Integer> table = new Hashtable<>(11);
        table.put("Mia", 100);
        table.put("Tim", 105);
        table.put("Bea", 200);
        table.put("Zoe", 210);
        table.put("Jan", 220);
        table.put("Ada", 250);
        table.put("Leo", 270);
        table.put("Sam", 290);
        table.put("Lou", 300);
        table.put("Max", 310);
        table.put("Ted", 330);

        System.out.println(table.get("Sam"));
        //table.remove("Sam");
        //table.clear();

        for(String key: table.keySet())
            System.out.println(key.hashCode() + " " + key.hashCode()%11 + " " + key + " " + table.get(key));
    }
}
