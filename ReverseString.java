//Write a function to reverse a string without using buuilt in function

public class ReverseString {
    public static String reverse(String str){
        String reversed=" ";

        for(int i = str.length()-1;i>=0;i--){
            reversed = reversed+str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args){
        String input = "Haiul";
        String output = reverse(input);

        System.out.println("Orginal"+input);
        System.out.println("Reversed:"+output);
    }
}
