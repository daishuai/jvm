package com.daishuai;

/**
 * 虚拟机栈和本地方法栈溢出
 *
 * @author Daishuai
 * @date 2021/10/9 12:03
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        // -Xoss 设置本地方法栈大小，-Xss 设置栈大小
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length: " + javaVMStackSOF.stackLength);
            throw e;
        }
    }
}
