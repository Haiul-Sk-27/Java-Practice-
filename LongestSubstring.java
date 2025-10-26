//find the longest substring without using buil in function.

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        int[] visited = new int[256];
        for(int i = 0;i<256;i++){
            visited[i] = -1;
        }

        int maxLen = 0;
        int start = 0;

        for(int end =0; end<s.length();end++){
            char ch = s.charAt(end);

            if(visited[ch] >= start){
                start = visited[ch]+1;
            }

            visited[ch] = end;
            int currentLen = end - start +1;

            if(currentLen > maxLen){
                maxLen = currentLen;
            }
        }

        return maxLen;
    }

    public static void main (String[] args){
        String s = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(s)); // 
    }
}
