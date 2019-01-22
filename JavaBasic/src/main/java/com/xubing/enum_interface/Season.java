package com.xubing.enum_interface;

/**
 * @author xubing xbbjava@163.com
 * @className Season
 * @description TODO
 * @date 2018/5/16 11:14
 */
public enum Season {
    /**
     * 春天
     */
    SPRING,
    /**
     * 夏天
     */
    SUMMER,
    /**
     * 秋天
     */
    AUTUMN,
    /**
     * 冬天
     */
    WINTER;

    public static void main(String[] args) {

        System.out.println(Season.valueOf("SPRING"));
        System.out.println(Season.values()[0]);
        System.out.println(SPRING.name());
        System.out.println(SPRING.ordinal());
        System.out.println(123456);
        System.console().readPassword();
    }
}
