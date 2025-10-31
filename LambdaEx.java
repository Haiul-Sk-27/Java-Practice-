 interface Op { int run(int a,int b); }
public class LambdaEx {
    public static void main(String[] args) {
        Op add=(a,b)->a+b;
        System.out.println(add.run(2,3));
    }
}
