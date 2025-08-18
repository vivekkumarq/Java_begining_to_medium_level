package LeetcodePractice;
public class GoatLatin {
    public static String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder();

            if (vowels.indexOf(word.charAt(0)) != -1) {
                // Word starts with a vowel
                sb.append(word);
            } else {
                // Word starts with a consonant
                sb.append(word.substring(1));
                sb.append(word.charAt(0));
            }

            sb.append("ma");
            // Add 'a' repeated (i+1) times
            for (int j = 0; j <= i; j++) {
                sb.append('a');
            }

            if (i > 0) result.append(" ");
            result.append(sb);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        // Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
        // Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
    }
}
