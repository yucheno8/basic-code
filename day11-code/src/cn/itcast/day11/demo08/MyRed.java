package cn.itcast.day11.demo08;

import cn.itcast.day11.red.RedPacketFrame;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class MyRed extends RedPacketFrame {


    /**
     * ���췽�������ɺ�����档
     *
     * @param title ����ı���
     */
    public MyRed(String title) {
        super(title);
    }
}
