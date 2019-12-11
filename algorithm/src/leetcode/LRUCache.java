package leetcode;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

    private LinkedHashMap<Integer, Integer> cache;
    private int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new LinkedHashMap<Integer, Integer>(16, 0.75F, true ) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                if(cap+ 1 == cache.size()){
                    return true;
                }else{
                    return false;
                }
            }
        };
    }
    
    public int get(int key) {
        return cache.get(key) == null ? -1: cache.get(key);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
}