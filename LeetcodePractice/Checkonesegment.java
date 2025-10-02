public class Checkonesegment {
     public boolean checkOnesSegment(String s) {
      
        return !s.contains("01");
    }

    public static void main(String[] args) {
        Checkonesegment sol = new Checkonesegment();
        System.out.println(sol.checkOnesSegment("1001")); 
        System.out.println(sol.checkOnesSegment("110")); 
        System.out.println(sol.checkOnesSegment("1"));    
        System.out.println(sol.checkOnesSegment("101"));  
    }
}
