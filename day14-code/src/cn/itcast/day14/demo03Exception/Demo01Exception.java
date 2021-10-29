package cn.itcast.day14.demo03Exception;

import java.util.Arrays;
import java.util.List;

/**
 * @author yucheno8
 * @date 2021/10/8/008
 **/
public class Demo01Exception {

    public static void main(String[] args) {
        /*
            多个异常使用捕获又该如何处理呢？
                1.多个异常分别处理。
                2.多个异常一次捕获，多次处理。
                3.多个异常一次捕获一次处理。
         */
        // 1.多个异常分别处理。
        /*try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException: 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            List<Object> list = Arrays.asList(1, 2, 3);
            System.out.println(list.get(3)); // java.lang.ArrayIndexOutOfBoundsException: 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        */


        // 2.多个异常一次捕获，多次处理。
        /*try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException: 3
            List<Integer> lsit = List.of(1, 2, 3);
            System.out.println(list.get(3)); // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException w) {
            System.out.println(w);
        }*/

        /*
            一个try多个catch注意事项：
                catch里边定义的异常变量，如果有子父关系，那么子类的异常变量必须写在上面，否则就会报错
                ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */

        // 3.多个异常一次捕获，一次处理。
        /*try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException: 3
            List<Integer> lsit = List.of(1, 2, 3);
            System.out.println(list.get(3)); // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (IndexOutOfBoundsException w) {
            System.out.println(w);
        }*/

        // 运行时异常被抛出可以不处理。即不捕获也不声明抛出。
        // 默认给虚拟机处理，终止程序，什么时候不抛出运行时异常了，再来继续执行程序
        /*int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException: 3
        List<Integer> lsit = List.of(1, 2, 3);
        System.out.println(list.get(3)); // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3*/


        System.out.println("后续代码！");
    }
}