import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FNCTN {
    public static void main(String[] args){
        Predicate<Integer> isEven = x -> x % 2 ==0;
        Function<Integer,Integer> square = x -> x*x;
        Consumer<Integer> print = System.out::println;

        if(isEven.test(4)) System.out.println(square.apply(4));
    }
}