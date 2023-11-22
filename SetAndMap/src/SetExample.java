import java.util.*;

public class SetExample
{
    public static void main(String []args)
    {
        Set<String> hSet = new HashSet<>();
        //Set<String> tSet = new TreeSet<>();

        hSet.add("Ho");
        hSet.add("Issacman");
        hSet.add("Olsen");
        hSet.add("Binkley");
        hSet.add("Bui");

        System.out.println(hSet);

        //no duplication item
        hSet.add("Binkley");
        System.out.println(hSet);

        //remove from a set
        //hSet.remove("Ho");
        //hSet.clear();


        //check if a set contains an item
        System.out.println(hSet.contains("Ho"));


        for(String name: hSet){
            System.out.println(name);
        }

        hSet.forEach(System.out::println);

        Iterator<String> iterator = hSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove duplicated item using tree set
        ArrayList<String> lastnames = new ArrayList<>();
        lastnames.add("Ho");
        lastnames.add("Issacman");
        lastnames.add("Olsen");
        lastnames.add("Binkley");
        lastnames.add("Bui");
        lastnames.add("Ho");
        Set<String> nameSet = new TreeSet<>(lastnames);
        System.out.println(nameSet);
    }
}
