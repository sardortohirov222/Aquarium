import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class Controller {
    private HashMap<Integer, Generater> generaterHashMap;

    public HashMap<Integer, Generater> getGeneraterHashMap() {
        return generaterHashMap;
    }

    public void setGeneraterHashMap(HashMap<Integer, Generater> generaterHashMap) {
        this.generaterHashMap = generaterHashMap;
    }

    public void controllEveryThing(int male, int female, int length_to_hight_aqurium, int length_to_wheght_aqurium) {
        int count = 1;
        generaterHashMap = new HashMap<>();
        for (int i = 0; i < male; i++) {
            generaterHashMap.put(count, new Generater(Gender.MALE, 0, count));
            count++;
        }

        for (int i = 0; i < female; i++) {
            generaterHashMap.put(count, new Generater(Gender.FEMALE, 0, count));
            count++;
        }
        int num = 1;
        Random random;
        while (num == 1) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 1; i < count; i++) {
                random = new Random();
                if (generaterHashMap.containsKey(i)) {
                    int sum = generaterHashMap.get(i).getCountor_to_5();
                    int value = random.nextInt(1, length_to_hight_aqurium * length_to_wheght_aqurium);
                    Generater generater1 = new Generater(generaterHashMap.get(i).getGender(), sum = sum + 1, value);
                    generaterHashMap.put(i, generater1);

                    if (generaterHashMap.get(i).getCountor_to_5() > 5) {
                        generaterHashMap.remove(i, generater1);
                    }
                }
            }
            System.out.println(generaterHashMap);

            Multimap<Integer, Integer> multiMap = HashMultimap.create();
            for (int i = 1; i < count; i++) {
                if (generaterHashMap.containsKey(i)) {
                    multiMap.put(generaterHashMap.get(i).getLocation(), i);
                }
            }
            System.out.println(multiMap.asMap());

            Set<Integer> set = new LinkedHashSet<>();
            for (Integer valueslar : multiMap.keys()) {

                if (multiMap.get(valueslar).size() > 1) {
                    int mall = 0;
                    int famall = 0;
                    for (Integer inlunce : multiMap.asMap().get(valueslar)) {

                        if (generaterHashMap.get(inlunce).getGender().equals(Gender.FEMALE)) {
                            famall++;
                        }

                        if (generaterHashMap.get(inlunce).getGender().equals(Gender.MALE)) {
                            mall++;
                        }

                        set.add(inlunce);

                    }
                    if (mall > 0 && famall > 0) {
                        int kichinasi = Math.min(mall, famall);
                        for (int i = 0; i < kichinasi; i++) {
                            Random random1 = new Random();
                            int ran_gender = random1.nextInt(1, 3);
                            if (ran_gender == 1) {
                                generaterHashMap.put(count, new Generater(Gender.MALE, 0, 0));
                                count++;
                            } else {
                                generaterHashMap.put(count, new Generater(Gender.FEMALE, 0, 0));
                                count++;
                            }

                        }
                    }
                    set.clear();
                }

            }
            int man= (int) generaterHashMap.values().stream().filter(valus->valus.getGender().equals(Gender.MALE)).count();
            int girl= (int) generaterHashMap.values().stream().filter(valus->valus.getGender().equals(Gender.FEMALE)).count();

            System.out.println(" --------------------------------------------");
            System.out.println("Female fish:"+girl);
            System.out.println("");
            System.out.println("Male fish:"+man);
            System.out.println("");
            int s=man+girl;
            System.out.println("All fish:" +s);
            System.out.println("");
            System.out.println(" --------------------------------------------");
            if (generaterHashMap.isEmpty()){
                System.out.println("Baliqlariz Ulib  Ketti");
                num=2;

            }
        }


    }


}



