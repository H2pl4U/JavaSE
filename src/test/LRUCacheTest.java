package test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU ����
 * ������ʹ�� LinkedHashMap ʵ�ֵ�һ�� LRU ���棺
 * �趨��󻺴�ռ� MAX_ENTRIES Ϊ 3��
 * ʹ�� LinkedHashMap �Ĺ��캯���� accessOrder ����Ϊ true������ LRU ˳��
 * ���� removeEldestEntry() ����ʵ�֣��ڽڵ���� MAX_ENTRIES �ͻὫ������δʹ�õ������Ƴ���
 * @author ilovejava1314
 */
class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRIES = 3;

    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }

    LRUCache() {
        super(MAX_ENTRIES, 0.75f, true);
    }
}

public class LRUCacheTest {

	public static void main(String[] args) {
		LRUCache<Integer, String> cache = new LRUCache<>();
	    cache.put(1, "a");
	    cache.put(2, "b");
	    cache.put(3, "c");
	    cache.get(1);
	    cache.put(4, "d");
	    System.out.println(cache.keySet()); 	//[3,1,4] ֻ������������������δʹ�õ�ɾ��
	}

}
