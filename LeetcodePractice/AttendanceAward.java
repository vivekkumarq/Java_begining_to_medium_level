package LeetcodePractice;

public class AttendanceAward {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL")); 
        System.out.println(checkRecord("LLL"));   
        System.out.println(checkRecord("P"));     
        System.out.println(checkRecord("A"));     
        System.out.println(checkRecord("AA"));    
    }

    public static boolean checkRecord(String s) {
        int absentCount = 0;
        int consecutiveLates = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                absentCount++;
                if (absentCount >= 2) {
                    return false;
                }
                consecutiveLates = 0; 
            } else if (c == 'L') {
                consecutiveLates++;
                if (consecutiveLates >= 3) {
                    return false;
                }
            } else {
                consecutiveLates = 0; 
            }
        }

        return true;
    }
}

