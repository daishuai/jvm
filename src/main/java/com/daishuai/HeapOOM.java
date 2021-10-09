package com.daishuai;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆内存溢出
 *
 * @author Daishuai
 * @date 2021/10/9 9:31
 */
public class HeapOOM {

    public static void main(String[] args) {
        // -Xms堆的最小值，-Xmx堆的最大值
        // -XX:+HeapDumpOnOutOfMemoryError, 在出现内存溢出时Dump出当前的内存堆转储快照
        List<OOMObject> oomObjects = new ArrayList<>();
        while (true) {
            oomObjects.add(new OOMObject());
        }
    }

    static class OOMObject {

    }
}
