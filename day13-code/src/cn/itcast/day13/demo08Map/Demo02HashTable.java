package cn.itcast.day13.demo08Map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author yucheno8
 * @date 2021/8/5/005
 **/

/*
    java.util.HashTable<K,V>集合 implements Map<K,V>接口

    Hashtable：底层是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快

    HashMap集合（之前学的所有的集合）：可以存储null值，null键
    Hashtable集合，不能存储null值，null键

    Hashtable和Vector集合一样，在jdk1.2版本之后被更先进的集合（HashMap，ArrayList）取代了
    Hashtable的子类Properties依然活跃在历史舞台
    Properties集合是一个唯一和IO流相结合的集合
 */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null, "a"); // NullPointerException
//        table.put("b", null); // NullPointerException
//        table.put(null, null); // NullPointerException

    }
}
