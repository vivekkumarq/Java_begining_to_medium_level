import java.util.HashSet;

public class LongestSubstringwithoutRepeating {
    public static int lengthOfLongestSubstring(String s)
    {
       int left=0;
       int maxlength=0;
       HashSet<Character> set = new HashSet<>();
       for(int right =0;right<s.length();right++)
       {
        while(set.contains(s.charAt(right)))
        {
            set.remove(s.charAt(left));
            left++;
        
        }
        set.add(s.charAt(right));
        maxlength = Math.max(maxlength, right - left +1);
       }
       return maxlength;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println("longest substring length " + lengthOfLongestSubstring(s));
    }
  
}
