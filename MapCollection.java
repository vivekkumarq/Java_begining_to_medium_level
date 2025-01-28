import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,Integer> studentData = new HashMap<>();
        studentData.put("Vivek", 177);
        studentData.put("Harsh", 47);
        studentData.put("Goru", 46);
        studentData.put("Havana", 56);
        System.out.println("all data " + studentData);
        for (Map.Entry<String,Integer> e : studentData.entrySet()) {
            System.out.println("all keys " + e.getKey());
            
        }

        
    }
    
}
