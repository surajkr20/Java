package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class BasicsOfHashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(34);
        set.add(34);
        set.add(35);
        set.add(36);

        System.out.println(set);
        System.out.println(set.contains(35));   // return true or false if no exist or not(searching)
        System.out.println(set.isEmpty());  // set is empty or not
        System.out.println(set.size()); // returns no of unique elements

        // set.clear();    // remove all set elements

        // iterate on hashset(using enhanced loop)
        for(int val : set){
            System.out.println(val);
        }

        // using iterator
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
