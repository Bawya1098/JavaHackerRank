package sockMerchant;

import java.util.HashMap;

public class SockMerchant {
    int sockMerchant(int[] ar) {
        HashMap<Integer, Integer> map = getMap(ar);
        int sum = 0;
        for (int value : map.values()) {
            sum += value / 2;
        }
        return sum;
    }

    HashMap<Integer, Integer> getMap(int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        int value;
        for (int item : ar) {
            if (map.containsKey(item)) {
                value = map.get(item);
                map.put(item, value + 1);
            } else {
                map.put(item, count);
            }
        }
        return map;
    }
}
