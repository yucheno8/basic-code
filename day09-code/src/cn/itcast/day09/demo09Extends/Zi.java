package cn.itcast.day09.demo09Extends;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/
public class Zi extends Fu{
    int numZi = 20;
    int num = 200;

    public void methodZi(){
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }

}
