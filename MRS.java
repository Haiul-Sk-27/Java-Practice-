 import java.util.*;
 public class MRS {
    static void print(Integer x){ System.out.println(x); }
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3);
        list.forEach(MRS::print);
    }
 }