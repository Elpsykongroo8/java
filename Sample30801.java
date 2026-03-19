package jump2java;
import java.util.HashMap;
public class Sample30801 {
    public static void main(String[] args) {

    	        HashMap<String, String> map = new HashMap<>();
    	        map.put("people", "사람");
    	        map.put("baseball", "야구");
    	        System.out.println(map.get("people")); // "사람" 출력
    	        System.out.println(map.get("java"));  // null 출력

    }
}