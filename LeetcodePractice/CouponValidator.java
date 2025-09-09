package LeetcodePractice;

import java.util.*;

public class CouponValidator {
    public List<String> getValidCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result = new ArrayList<>();
        int n = code.length;
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 1);
        priority.put("grocery", 2);
        priority.put("pharmacy", 3);
        priority.put("restaurant", 4);
        List<String[]> valid = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isActive[i]) continue;
            if (!priority.containsKey(businessLine[i])) continue;
            if (!isValidCode(code[i])) continue;
            valid.add(new String[]{code[i], businessLine[i]});
        }
        valid.sort((a, b) -> {
            int cmp = Integer.compare(priority.get(a[1]), priority.get(b[1]));
            if (cmp == 0) return a[0].compareTo(b[0]);
            return cmp;
        });
        for (String[] v : valid) result.add(v[0]);
        return result;
    }

    private boolean isValidCode(String c) {
        if (c == null || c.isEmpty()) return false;
        return c.matches("[a-zA-Z0-9_]+");
    }

    public static void main(String[] args) {
        CouponValidator sol = new CouponValidator();
        String[] code1 = {"SAVE20","","PHARMA5","SAVE@20"};
        String[] business1 = {"restaurant","grocery","pharmacy","restaurant"};
        boolean[] active1 = {true,true,true,true};
        System.out.println(sol.getValidCoupons(code1, business1, active1));
        String[] code2 = {"GROCERY15","ELECTRONICS_50","DISCOUNT10"};
        String[] business2 = {"grocery","electronics","invalid"};
        boolean[] active2 = {false,true,true};
        System.out.println(sol.getValidCoupons(code2, business2, active2));
    }
}
