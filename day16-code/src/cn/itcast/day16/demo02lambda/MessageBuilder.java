package cn.itcast.day16.demo02lambda;

/**
 * @author yucheno8
 * @date 2022/2/20/020
 **/

/*

 */
@FunctionalInterface
public interface MessageBuilder {
    // 定义一个拼接消息的抽象方法，返回被拼接的消息
    public abstract String builderMessage();
}
