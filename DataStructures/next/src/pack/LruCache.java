package pack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Coder: yuyang
 * Date: 2019/11/20
 * Description:
 * Version:
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {

    private int maxSize;

    public LruCache(int maxSize) {
        super(16, 0.75f, true);
        this.maxSize = maxSize;

    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    public static void main(String[] args) {

        LruCache<String, String> cache = new LruCache<>(3);

        for (int i=0; i<10; i++){
            cache.put(String.valueOf(i), String.valueOf(i));
        }

        Set<Map.Entry<String, String>> lmp2 = cache.entrySet();

        for (Map.Entry<String, String> e : lmp2) {
            System.out.print(e.getKey() + " ");
        }

    }


}
