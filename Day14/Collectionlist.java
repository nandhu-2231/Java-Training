package Day14;

import java.util.Collection;
import java.util.ArrayList;

public class Collectionlist {
    public static void main(String[] args) {
        Collection<Object> list = new ArrayList<>(5);

        list.add(1);
        list.add(2.5);
        list.add("nandhini");
        list.add('n');
        list.add(1);

        list.remove(1);
        list.remove(1);

        for(int i=0 ; i< list.size() ; i ++){
            System.out.println(list.get(i));

        }

        System.out.println(list);

        /*Collection<Integer>set = new Hashset<>();

        set.add(1);
        set.add(2);
        set.add(8);
        set.add(5);
        set.add(2);
        set.add(3);
        set.remove(3);*/


    }
    
}
