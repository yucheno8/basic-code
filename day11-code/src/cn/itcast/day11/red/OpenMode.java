package cn.itcast.day11.red;

import java.util.ArrayList;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public interface OpenMode {

    /*
    * �뽫totalMoney�ֳ�count�ݣ����浽ArrayList<Integer>�У����ؼ��ɡ�
    *
    * @param totalMoney             �ܽ��Ϊ������㣬�Ѿ�ת��Ϊ��������λΪ�֡�
    * @param totalCount             �������
    * @return ArrayList<Integer>    Ԫ��Ϊ��������Ľ��ֵ������Ԫ�ص�ֵ��͵����ܽ�
    * */

    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
