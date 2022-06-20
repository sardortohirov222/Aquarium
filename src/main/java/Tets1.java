import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Tets1 {

    public static void main(String[] args) {
    HashMap<Integer,KattHarf> kattHarfHashMap=new HashMap<>();
    kattHarfHashMap.put(1,new KattHarf("sardor",6));
    kattHarfHashMap.put(2,new KattHarf("sardor",6));
    kattHarfHashMap.put(3,new KattHarf("sardor",6));
    kattHarfHashMap.put(4,new KattHarf("sardor",21));
    kattHarfHashMap.put(5,new KattHarf("mahmudjon",41));
    kattHarfHashMap.put(6,new KattHarf("mahmudjon",41));


//
//HashMap<Integer,Integer> integerHashMap=new HashMap<>();
//        for (int i = 1; i <kattHarfHashMap.size() ; i++) {
//            integerHashMap.put(kattHarfHashMap.get(i).getNumber(),i);
//
//        }
//        System.out.println(integerHashMap);


        Multimap<Integer, Integer> multiMap = HashMultimap.create();
        for (int i = 1; i <=kattHarfHashMap.size() ; i++) {
            multiMap.put(kattHarfHashMap.get(i).getNumber(),i);
        }
//        System.out.println(multiMap.asMap());
        int alo=0;

        for (Integer intiz:multiMap.asMap().get(6)
             ) {
            if(alo>0)
//            System.out.println(kattHarfHashMap.get(intiz).getName().equals(kattHarfHashMap.get(alo).getName()));
            alo=intiz;
        }

//        System.out.println(multiMap.asMap().get(6).stream().filter(a->kattHarfHashMap.get(a).getName().equals()));
//        System.out.println(multiMap.size());

//        System.out.println(multiMap);
//        for (Map.Entry<Integer,Integer> entry : ) {
//            multiMap.put(entry.getValue(), entry.getKey());
//        }
//        System.out.println(multiMap);

//        for (Map.Entry<KattHarf, Collection<Integer>> entry : multiMap.asMap().entrySet()) {
//            System.out.println("Original value: " + entry.getKey() + " was mapped to keys: "
//                    + entry.getValue());
//        }

//

    }


}
