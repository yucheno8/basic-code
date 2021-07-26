package cn.itcast.day09.demo13Override;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/
public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show(); // 把父类的show方法拿过来重发利用
        // 自己子类再来添加更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
