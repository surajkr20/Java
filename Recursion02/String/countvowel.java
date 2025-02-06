package Recursion02.String;

public class countvowel {
    public static void main(String[] args) {
        String name = "abhinavbhardwaj";
        System.out.println(count(name, 0));
    }

    static int count(String str, int idx){
        if( idx == str.length() - 1) return 0;
        if(str.charAt(idx) == 'a' | str.charAt(idx) == 'e' | str.charAt(idx) == 'i' | str.charAt(idx) == 'o' | str.charAt(idx) == 'u') return 1+count(str, idx+1);
        return count(str, idx+1);
    }
}
