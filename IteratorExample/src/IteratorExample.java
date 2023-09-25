// an example using the two ways of iterating over a collection

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorExample
{

    public static void main (String [] args)
    {
        //List<String> l = new ArrayList<>();
        List<String> l = new LinkedList<>();
        l.add("you");
        l.add("me");
        l.add("everyone");

        Iterator<String> i = l.iterator();

        // way 1
        while (i.hasNext())
        {
            String s = i.next();
            System.out.println("s = " + s);
        }

        // way 2
        for(String x : l)
            System.out.println("x = " + x);
    }


    // way 2 is basically syntactic sugar wrapping way 1.
    // it is typically preferred unless you need to modify the collection.
    // for example to remove an element:
    public Boolean remove(List<String> aList, String name)
    {
        Iterator<String> i = aList.iterator();

        while (i.hasNext())
        {
            String current = i.next();
            if (current.compareTo(name) == 0)
            {
                i.remove();
                return true;
            }
        }
        return false;
    }

}
