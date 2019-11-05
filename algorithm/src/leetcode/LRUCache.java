package leetcode;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

    private LinkedHashMap<Integer, Integer> cache;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<Integer, Integer>(16, 0.75F, true ) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                if(capacity+ 1 == cache.size()){
                    return true;
                }else{
                    return false;
                }
            }
        };
    }
    
    public int get(int key) {
        return cache.get(key);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
    }
}