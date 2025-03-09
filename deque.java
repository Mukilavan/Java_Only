import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class deque {

    public static int romanIntDeque(String s){
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1); romanMap.put('V', 5); romanMap.put('X', 10);
        romanMap.put('L', 50); romanMap.put('C', 100); romanMap.put('D', 500); romanMap.put('M', 1000);

        Deque<Integer> deque = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            deque.add(romanMap.get(c));
        }

        int total = 0;
        int prev = 0;

        while(!deque.isEmpty()){
            int current = deque.pollLast();
            // if (!deque.isEmpty() && current < deque.peekLast()) { It fails in only add case
            //     total -= current; // The logic assumes that every smaller value should be subtracted — which isn’t always true.
            // } else {
            //     total += current;
            // }

            /*
             *  ✅ Correct logic for both increasing and decreasing numeral patterns.
                ✅ Uses Deque effectively for reverse traversal.
                ✅ Maintains O(n) time complexity.
             */
            
            if(current < prev) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanIntDeque("LVIII"));

    }

}
