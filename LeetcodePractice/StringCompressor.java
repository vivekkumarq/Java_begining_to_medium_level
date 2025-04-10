package LeetcodePractice;

public class StringCompressor {
    public static int compress(char[] chars) {
        int index = 0;  
        int i = 0;    

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

           
            chars[index++] = currentChar;

            
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; 
    }

    public static void main(String[] args) {

        char[] chars1 = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars1)); 

        char[] chars2 = {'a'};
        System.out.println(compress(chars2)); 

        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars3)); 
    }
}