import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.HashMap;

public class MapExample
{
    public static void main(String []args)
    {
        Map<String,String> aColorMap = new HashMap<>();
        //Map<String,String> aColorMap = new TreeMap<>();

        aColorMap.put("I","Blue");
        aColorMap.put("You","Green");

        System.out.println(aColorMap.get("I"));
        System.out.println(aColorMap);

        for(String key: aColorMap.keySet()){
            System.out.println(key + "->" + aColorMap.get(key));
        }

        for(Map.Entry pair :  aColorMap.entrySet()){
            System.out.println(pair.getKey() + "->" + pair.getValue());
        }


    }
}
