package cn.itcast.day13.demo06Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yucheno8
 * @date 2021/8/3/003
 **/

/*
    java.util.Map<k,v>集合
    Map集合的特点：
            1. Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
            2. Map集合中的元素，key和value的数据类型可以相同，也可以不同
            3. Map集合中的元素，key是不允许重复的，value是可以重复的
            4. Map集合中的元素，key和value是一一对应的

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合特点：
        1. HashMap集合底层是哈希表：查询的速度特别快
            JDK1.8之前：数组 + 单向链表
            JDK1.8之后：数组 + 单向链表/红黑树（链表的长度超过8）：提高查询的速度
        2. HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap的特点：
         1. LinkedHashMap集合底层是哈希表 + 链表（保证迭代的顺序）
         2. LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的

 */
public class Demo01Map {

    public static void main(String[] args) {
        show04();
    }

    /*
        boolean containsKey(Object key)  判断集合中是否包含指定的键。
            包含：返回true
            不包含：返回false
     */
    private static void show04() {
        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println("b1:" + b1); // b1:true

        boolean b2 = map.containsKey("赵颖");
        System.out.println("b2:" + b2); // b2:false


    }

    /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值v：
                key存在，v返回对应的值
                key不存在，v返回null
     */
    private static void show03() {
        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map); // {林志玲=178, 赵丽颖=168, 杨颖=165}

        Integer v1 = map.get("杨颖");
        System.out.println("v1:" + v1); // v1:165

        Integer v2 = map.get("迪丽热巴");
        System.out.println("v2:" + v2); // v2:null
    }

    /*
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值：v
                key存在，v返回被删除的值
                key不存在，v返回null
     */
    private static void show02() {
        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map); // {林志玲=178, 赵丽颖=168, 杨颖=165}

        Integer v1 = map.remove("林志玲");
        System.out.println("v1：" + v1); // v1：178

        System.out.println(map); // {赵丽颖=168, 杨颖=165}

//        int v2 = map.remove("林志颖"); // 自动拆箱 NullPointerException
        Integer v2 = map.remove("林志颖");
        System.out.println("v2：" + v2); // v2：null

        System.out.println(map); // {赵丽颖=168, 杨颖=165}



    }

    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            返回值：v
                存储键值对的时候，key不重复，返回值v是null
                存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回值被替换的value
     */
    private static void show01() {
        // 创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:" + v1); // v1:null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:" + v2); // v2:范冰冰1

        System.out.println(map); // {李晨=范冰冰2}

        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);

    }
}
