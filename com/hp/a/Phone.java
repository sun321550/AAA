package com.hp.a;

/**555
 * 标准的单例模式
 * String 框架默认 单例模式
 */
public class Phone {

    private static Phone ourInstance = new Phone();

    public static Phone getInstance() {
        return ourInstance;
    }

    private Phone() {
    }
}
