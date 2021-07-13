package cn.itcast.day07.demo04ArrayList;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2020/5/4/004
 **/
public class Demo04ArrayListEach {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
