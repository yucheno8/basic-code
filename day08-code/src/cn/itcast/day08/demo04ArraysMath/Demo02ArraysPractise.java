package cn.itcast.day08.demo04ArraysMath;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/
import java.util.Arrays;

/*
��Ŀ��
��ʹ��Arrays��ص�API����һ������ַ����е������ַ��������У��������ӡ��
 */
public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "asv76agfqwdfvasdfvjh";

        // ��ν����������У�sort
        // ������һ�����飬������Arrays.sort����
        // String --> ���飬��toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // ���ַ����������������

        // ��Ҫ�������
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }

}
