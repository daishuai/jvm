package com.daishuai;

/**
 * 引用计数器算法
 *
 * @author Daishuai
 * @date 2021/10/9 14:57
 */
public class ReferenceCountingGC {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private final byte[] bigSize = new byte[_1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
        // -XX:PrintGCDetails打印GC详细日志
        System.gc();
    }
}
