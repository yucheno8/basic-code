package cn.itcast.day09.demo13Override;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=======");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();

    }
}
