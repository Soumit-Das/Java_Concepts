package Collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_and_Generics_Iterator_Interface
{
    public static void main(String[] args)
    {
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);

//		System.out.println(values);

        Iterator it = values.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
