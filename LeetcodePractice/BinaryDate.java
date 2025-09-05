package LeetcodePractice;

public class BinaryDate {
    public static String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return Integer.toBinaryString(year) + "-" + 
               Integer.toBinaryString(month) + "-" + 
               Integer.toBinaryString(day);
    }

    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29")); 
        System.out.println(convertDateToBinary("1900-01-01")); 
    }
}
