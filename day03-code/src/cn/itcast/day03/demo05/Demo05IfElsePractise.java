package cn.itcast.day03.demo05;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/
public class Demo05IfElsePractise {
    public static void main(String[] args) {
        int score = 120;
        if (score >= 90 && score <= 100) {
            System.out.println("����");
        } else if (score >= 80 && score < 90) {
            System.out.println("��");
        } else if (score >= 70 && score < 80) {
            System.out.println("��");
        } else if (score >= 60 && score < 70) {
            System.out.println("����");
        } else if (score >= 0 && score < 60) {
            System.out.println("������");
        } else { // ��������߽�֮��Ĳ��������
            System.out.println("���ݴ���");
        }
    }
}
