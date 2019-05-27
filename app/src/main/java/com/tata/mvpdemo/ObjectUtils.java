package com.tata.mvpdemo;

/**
 * Description:   <br>
 * Author: liu.zhanta <br>
 * Date: 2018/12/17 上午10:43
 * Version: 4.9
 */
public class ObjectUtils {

    private ObjectUtils() {
        //no instance
    }

    /**
     * 判断一组对象是否为空（or条件）
     *
     * @param args
     * @return
     */
    public static boolean isOrNull(Object... args) {
        if (args == null) {
            return true;
        }
        for (Object arg : args) {
            if (arg == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断一组对象是否为空（and 条件）
     *
     * @param args
     * @return
     */
    public static boolean isAndNull(Object... args) {
        if (args == null) {
            return true;
        }
        int matchIndex = 0;
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if (arg == null) {
                matchIndex++;
            }
        }

        return matchIndex == args.length;
    }
}
