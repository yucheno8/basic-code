package cn.itcast.day09.demo08Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/

/*
�ڼ̳еĹ�ϵ�У����������һ�����ࡱ��Ҳ����˵��������Ա��������࿴����
���縸����Ա���������ǽ�ʦ����ô����ʦ����һ��Ա��������ϵ��is-a

���常��ĸ�ʽ����һ����ͨ���ඨ�壩
public class �������� {
    // ...
}

��������ĸ�ʽ��
public class �������� extends �������� {
    // ...
}
 */
public class Demo01Extends {
    public static void main(String[] args) {
        // ������һ���������
        Teacher teacher = new Teacher();
        // Teacher�൱����Ȼʲô��ûд���ǻ�̳����Ը����method������
        teacher.method();

        // ������һ���������̵Ķ���
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
