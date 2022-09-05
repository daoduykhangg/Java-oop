package old.Lession.lesson_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencies = new HashMap<>();
        emergencies.put(113, "Police Dept");
        emergencies.put(114, "Fire Dept");
        emergencies.put(115, "Hospital Dept");
        emergencies.put(116, "Others");
        emergencies.put(117, "Others");

//        emergencies.replace(113,"CSCD");
//        emergencies.replace(113,"Police Dept","CSCD_ABC");
//        emergencies.remove(117,"Others Dept");
//        System.out.println(emergencies.get(117));

        Set<Integer> allKeys = emergencies.keySet();
//        for (Integer key : allKeys) {
//            if (emergencies.get(key).equals("Others")) {
//                emergencies.remove(key);
//            }
//        }

        Iterator<Map.Entry<Integer, String>> emergencyListIterator = emergencies.entrySet().iterator();
        while (emergencyListIterator.hasNext()) {
            Map.Entry<Integer, String> entry = emergencyListIterator.next();
            String entryValue = entry.getValue();
            if (entryValue.equals("Others")){
                emergencyListIterator.remove();
            }
        }
        for (Integer key : allKeys) {
            System.out.println(emergencies.get(key));
        }

    }
}
