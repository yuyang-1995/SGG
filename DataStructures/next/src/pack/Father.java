package pack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Coder: yuyang
 * Date: 2019/11/12
 * Description:
 * Version:
 */
public class Father {

    public Father() {
        System.out.println("I am Father");

    }

    public static void main(String[] args) {

        LinkedHashMap<String ,String> linkedHashMap1 = new LinkedHashMap();

        for (int i =0; i < 10; i++) {

            linkedHashMap1.put("" + i, "" + i);
        }

        linkedHashMap1.get("6");
        linkedHashMap1.get("8");

        Set<Map.Entry<String, String>> lmp1 = linkedHashMap1.entrySet();



        for (Map.Entry<String, String> e : lmp1) {
            System.out.print(e.getKey() + " ");
        }


        System.out.println();


        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap(16, 0.75f, true);

        for (int i =0; i < 10; i++) {

            linkedHashMap2.put("" + i, "" + i);
        }

        linkedHashMap2.get("6");
        linkedHashMap2.get("8");

        Set<Map.Entry<String, String>> lmp2 = linkedHashMap2.entrySet();



        for (Map.Entry<String, String> e : lmp2) {
            System.out.print(e.getKey() + " ");
        }


    }
}
