package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/

/*
����˵����
    �������ȥ֮�������˶��к�������������֮�����һ�������Ⱥ���Լ���
��������붼���ֳɵģ�������Ҫ���ľ�������⡣
�����Լ�Ҫ���������У�
    1. ����һ�³���ı��⣬ͨ�����췽�����ַ�������
    2. ����Ⱥ������
    3. ���÷ַ����ԣ�ƽ�������������

����ַ��Ĳ��ԣ�
    1. ��ͨ�����ƽ������totalMoney / totalCount�������������һ��������С�
    2. ��������������������һ��Ǯ����಻����ƽ������2����Ӧ��Խ��Խ�١�
 */
public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("���ǲ���˫Ԫ�γ�");

        // ����Ⱥ������
        red.setOwnerName("��˼��");

        // ���÷ַ����ԣ���ͨ���
        /*OpenMode normal = new NormalMode();
        red.setOpenWay(normal);*/

        // �������
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }


}
