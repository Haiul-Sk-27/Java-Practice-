import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class STRM {
      public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        int sumSquaresOfEven = nums.stream().filter(x->x%2==0).map(x->x*x).reduce(0,Integer::sum);
        List<Integer> doubled = nums.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println(sumSquaresOfEven + ", " + doubled);
    }
}
