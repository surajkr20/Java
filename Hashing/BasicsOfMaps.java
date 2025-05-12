package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicsOfMaps {
    public static void main(String[] args) {
        // Storing country name and population
        HashMap<String, Integer> countryInfo = new HashMap<>();

        countryInfo.put("India", 120);
        countryInfo.put("china", 150);
        countryInfo.put("Russia", 30);

        System.out.println(countryInfo);
        System.out.println(countryInfo.containsKey("India"));
        System.out.println(countryInfo.containsValue(30));
        System.out.println(countryInfo.size());
        System.out.println(countryInfo.keySet());
        System.out.println(countryInfo.entrySet());
        System.out.println(countryInfo.get("india"));

        // iteration on maps- using enhanced for loop
        for(Map.Entry<String, Integer> val: countryInfo.entrySet()){
            System.out.println(val.getKey() + " : " + val.getValue());
        }

        // iteration - using Set
        Set<String> st = countryInfo.keySet();
        for(String key: st){
            System.out.println(key + " : " + countryInfo.get(key));
        }
    }
}
