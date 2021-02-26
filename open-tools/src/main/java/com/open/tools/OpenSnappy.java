package com.open.tools;

import org.xerial.snappy.Snappy;

import java.io.IOException;

/**
 * 压缩文本算法
 * Description: 使用Google的Snappy压缩算法
 *
 * @author Yangrunkang
 * @Copyright: Copyright(C) 2016
 * @Company: HQYG
 * @CreateDate: 2019/4/10 11:10
 * <p>
 * https://github.com/google/snappy
 * https://github.com/xerial/snappy-java
 * <p>
 * All rights Reserved, Designed By HQYG
 */
public class OpenSnappy {

    /**
     * 压缩
     *
     * @param html
     * @return
     */
    public static byte[] compress(String html) {
        try {
            return Snappy.compress(html.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解压
     *
     * @param bytes
     * @return
     */
    public static String decompress(byte[] bytes) {
        try {
            return new String(Snappy.uncompress(bytes));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        String helloWorld = "Hello,world";
        byte[] compress = OpenSnappy.compress(helloWorld);
        System.out.println(compress);
        System.out.println(OpenSnappy.decompress(compress));
    }
}
