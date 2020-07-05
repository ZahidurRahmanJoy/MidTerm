package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> mapZipCode = new HashMap<Integer, String>();



        mapZipCode.put(11373, "NYC");
        mapZipCode.put(45352, "LA");
        mapZipCode.put(63423, "Denver");
        mapZipCode.put(63463, "Boston");
        mapZipCode.put(23452, "San Jose");
        mapZipCode.put(63463, "Seattle");
        System.out.println(mapZipCode);
        System.out.println("Collection View: " + mapZipCode.values());



    }

}
