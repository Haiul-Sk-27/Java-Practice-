//Determine if a given String is a palindrome

public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        str = str.trim();
        int left = 0;
        int right= str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){
        String word1 = "Sumona";
        String word2 = "madam";


        System.out.println(word1 + " → Palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " → Palindrome? " + isPalindrome(word2));
    }
}
