package LeetcodePractice;

import java.util.*;

public class UniqueEmails {
    public static int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            
           
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }
            
           
            local = local.replace(".", "");
            
            unique.add(local + "@" + domain);
        }
        
        return unique.size();
    }

    public static void main(String[] args) {
        String[] emails1 = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };
        System.out.println(numUniqueEmails(emails1)); 

        String[] emails2 = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(emails2)); 
    }
}

