package Hashing;

import java.util.HashMap;
import java.util.Map;

public class practise {

    public static void main(String[] args) {
        HashMap<String, Integer> StdInfo = new HashMap<>();

        StdInfo.put("AbhinavBhardwaj", 04);
        StdInfo.put("suraj", 05);
        StdInfo.put("AbhinavSuraj", 06);

        // System.out.println(StdInfo);

        // System.out.println(StdInfo.get("suraj"));
        // System.out.println(StdInfo.containsValue(6));

        // System.out.println(StdInfo.keySet());
        // System.out.println(StdInfo.values());

        // System.out.println(StdInfo.entrySet());


        for(Map.Entry<String, Integer> val: StdInfo.entrySet()){
            System.out.println(val.getKey() + " : " + val.getValue());
        }
        
    }
}