package com.atwzs.reggie.common;

/**
 * @ClassName BaseContext
 * @Description ThreadLocal的工具类
 * @Author TangJunjie
 * @Date 12:34 2023/9/1
 * @Version 11.0.15
 */
public class BaseContext {

    private static final ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

}
