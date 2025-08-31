package LeetcodePractice;

public class CountAsterisks {
    public static int countAsterisks(String s) {
        int count = 0;
        boolean insideBar = false;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                insideBar = !insideBar;
            } else if (c == '*' && !insideBar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));   
        System.out.println(countAsterisks("iamprogrammer"));       
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }
}

