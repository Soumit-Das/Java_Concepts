package Collection_framework;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Collection_and_Generics_Map_Interface
{
    public static void main(String[] args)
    {
        Map<String , String> map = new HashMap();
//		Map<String , String> map = new Hashtable<>();
        map.put("myName", "Navin");
        map.put("actor", "John");
        map.put("ceo ", "Marisa");
        map.put("actor", "Navin");

        Set<String> keys = map.keySet();

        for(String key : keys)
        {
            System.out.println(key + " " + map.get(key));
        }

//		System.out.println(map);
    }
}
