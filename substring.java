 import java.util.*;
 public class substring {
    public static void main(String[] args) {
        String s="abcabcbb";
        int l=0, best=0; Map<Character,Integer> pos=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(pos.containsKey(c) && pos.get(c)>=l) l=pos.get(c)+1;
            pos.put(c,r); best=Math.max(best, r-l+1);
        }
        System.out.println(best);
    }
 }