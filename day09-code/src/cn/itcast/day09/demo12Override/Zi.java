package cn.itcast.day09.demo12Override;

import java.security.PublicKey;

/**
 * @author yucheno8
 * @date 2021/7/23/023
 **/

/*

 */
public class Zi extends Fu {

    @Override  // 起到重写安全检测的作用
    public String method() {
        return null;
    }

}
