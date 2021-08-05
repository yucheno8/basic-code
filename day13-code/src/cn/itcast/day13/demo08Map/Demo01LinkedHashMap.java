package cn.itcast.day13.demo08Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author yucheno8
 * @date 2021/8/5/005
 **/

/*
    java.utils.LinkedHashMap<K,V> extends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理：
        哈希表+链表（记录元素的顺序）
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map); // key不允许重复，无序 {a=d, b=b, c=c}

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("b", "b");
        linked.put("c", "c");
        linked.put("a", "d");
        System.out.println(linked); // key不允许重复，有序 {a=d, b=b, c=c}
    }
}
