public class FirstOccurence {
    public static int findingOccurence(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (needle.isEmpty()) return 0;
        
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = findingOccurence(haystack, needle);

        System.out.println("Index of first occurrence: " + result);
    }
    
}
