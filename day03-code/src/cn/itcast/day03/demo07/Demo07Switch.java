package cn.itcast.day03.demo07;

/**
 * @author yucheno8
 * @date 2021/7/13/013
 **/
public class Demo07Switch {
    public static void main(String[] args) {
        int num = 10;

        switch (num) {
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("���ݲ�����");
                break; // ���һ��break������ʡ�ԣ�����ǿ���Ƽ���Ҫʡ��
        }
    }
}