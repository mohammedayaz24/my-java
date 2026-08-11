import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
    }
}