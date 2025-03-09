import java.util.HashMap;
import java.util.Map;

public class romanToInt {

    public static int romanInt(String s){
        Map<String, Integer> romanMap = new HashMap<>();
        // Mapping single and double character values
        romanMap.put("I", 1); romanMap.put("IV", 4); romanMap.put("V", 5);
        romanMap.put("IX", 9); romanMap.put("X", 10); romanMap.put("XL", 40);
        romanMap.put("L", 50); romanMap.put("XC", 90); romanMap.put("C", 100);
        romanMap.put("CD", 400); romanMap.put("D", 500); romanMap.put("CM", 900);
        romanMap.put("M", 1000);

        int total = 0;
        int i = 0;
        while (i < s.length()) {
            // Check if the next two-character substring is in the map
            if (i < s.length() - 1 && romanMap.containsKey(s.substring(i, i + 2))) {
                total += romanMap.get(s.substring(i, i + 2));
                i += 2; // Move forward by 2
            } else {
                total += romanMap.get(s.substring(i, i + 1));
                i += 1; // Move forward by 1
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanInt("LVIII"));
    }
}
