package LeetcodePractice;

public class RearrangeSpaces {
    public static String reorderSpaces(String text) {

        int totalSpaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') totalSpaces++;
        }

       
        String[] words = text.trim().split("\\s+");
        int numWords = words.length;

      
        if (numWords == 1) {
            StringBuilder sb = new StringBuilder(words[0]);
            for (int i = 0; i < totalSpaces; i++) {
                sb.append(" ");
            }
            return sb.toString();
        }

        int spacesBetween = totalSpaces / (numWords - 1);
        int extraSpaces = totalSpaces % (numWords - 1);

        String spaceStr = " ".repeat(spacesBetween);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numWords; i++) {
            result.append(words[i]);
            if (i != numWords - 1) {
                result.append(spaceStr);
            }
        }

        
        result.append(" ".repeat(extraSpaces));

        return result.toString();
    }

    public static void main(String[] args) {
        String text1 = "  this   is  a sentence ";
        System.out.println(reorderSpaces(text1)); 
 

        String text2 = " practice   makes   perfect";
        System.out.println(reorderSpaces(text2)); 

    }
}
