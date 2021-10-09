package com.daishuai;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * @author Daishuai
 * @date 2021/10/8 19:27
 */
public class ObjectHeader {
    public static void main(String[] args) throws InterruptedException {
        // 测试无锁，不可偏向
    }

    /**
     * 测试无锁，不可偏向
     *
     * @throws InterruptedException
     */
    public static void unlock() throws InterruptedException {
        // -XX:BiasedLockingStartupDelay偏向锁延时开启时间
        System.out.println("第一次结果:");
        System.out.println(ClassLayout.parseInstance(new Object()).toPrintable());
        TimeUnit.SECONDS.sleep(4);
        System.out.println("第二次结果:");
        System.out.println(ClassLayout.parseInstance(new Object()).toPrintable());
    }

    public static void biasedUnlock() {

    }
}
