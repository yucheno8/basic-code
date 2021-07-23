package cn.itcast.day09.demo06StringBuilder;

/**
 * @author yucheno8
 * @date 2021/7/22/022
 **/
public class Test02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        // append方法
        sb.append("abc");
        sb.append(true);
        sb.append(100);
        sb.append("hello").append("world").append("java");

        // reverse方法
        sb.reverse();

        // toString方法
        System.out.println(sb);
    }
}
