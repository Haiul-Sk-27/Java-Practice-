 import java.util.Optional;
 public class optionalDemo{
    public static void main(String[] args) {
        Optional<String> o = Optional.ofNullable(null);
        System.out.println(o.orElse("default"));
    }
 }