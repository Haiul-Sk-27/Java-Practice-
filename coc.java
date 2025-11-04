 import java.util.*;
 public class coc {
    public static void main(String[] args) {
        String s="to be or not to be";
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String w: s.trim().toLowerCase().split("\\s+"))
            map.put(w, map.getOrDefault(w,0)+1);
        System.out.println(map);
    }
 }