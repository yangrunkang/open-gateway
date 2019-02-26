package com.experiment.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Description:
 * All rights Reserved, Designed By HQYG
 *
 * @author Yangrunkang
 * @Copyright: Copyright(C) 2016
 * @Company: HQYG
 * @CreateDate: 2019/2/26 14:23
 */
public class FutureEx {
    public static void main(String[] args) {

        try {
            ExecutorService es = Executors.newFixedThreadPool(10);
            Future<Integer> f = es.submit(() -> {
                // 长时间的异步计算
                // ……
//                Thread.sleep(10 * 2000);
                // 然后返回结果
                return 100;
            });

//            while (!f.isDone()) {
//                System.out.println("还没有完成");
//            }


//            while (f.isDone()) {
//                System.out.println("完成");
//            }

            //阻塞式获取结果
            Integer integer = f.get();
            System.out.println(integer);

        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
