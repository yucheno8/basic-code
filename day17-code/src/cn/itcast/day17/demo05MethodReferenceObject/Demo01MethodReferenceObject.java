package cn.itcast.day17.demo05MethodReferenceObject;

/**
 * @author yucheno8
 * @date 2022/2/23/023
 **/

/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的，成员方法也是存在的
    就可以使用对象名引用成员方法
 */
public class Demo01MethodReferenceObject {
    // 定义一个方法，方法的参数传递Printable接口
    public static void printString(Printable p) {
        p.print("hello");
    }

    public static void main(String[] args) {
        // 调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递Lambda表达式
        printString((s)->{
            // 创建MethodRefObject对象
            MethodRefObject obj = new MethodRefObject();
            // 调用MethodRefObject对象中的成员方法printUpperCaseString，把字符串按照大写输出
            obj.printUpperCaseString(s);
        });

        /*
            使用方法引用优化Lambda
            对象时已经存在的MethodRefObject
            成员方法也是已经存在的printUpperCaseString
            所以我们可以使用对象名引用成员方法
         */
        // 创建MethodRefObject对象
        MethodRefObject obj = new MethodRefObject();
        printString(obj::printUpperCaseString);
    }
}
