package LeetcodePractice;

import java.util.*;

public class SearchSuggestionSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products); 
        List<List<String>> result = new ArrayList<>();
        String prefix = "";

        for (char c : searchWord.toCharArray()) {
            prefix += c;
            List<String> suggestions = new ArrayList<>();
            int count = 0;

            for (String product : products) {
                if (product.startsWith(prefix)) {
                    suggestions.add(product);
                    count++;
                }
                if (count == 3) break;
            }

            result.add(suggestions);
        }

        return result;
    }

    
    public static void main(String[] args) {
        SearchSuggestionSystem system = new SearchSuggestionSystem();

        String[] products1 = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord1 = "mouse";

        String[] products2 = {"havana"};
        String searchWord2 = "havana";

        System.out.println("Output 1: " + system.suggestedProducts(products1, searchWord1));
        System.out.println("Output 2: " + system.suggestedProducts(products2, searchWord2));
    }
}

