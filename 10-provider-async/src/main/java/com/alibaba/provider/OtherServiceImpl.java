package com.alibaba.provider;

import com.alibaba.service.OtherService;

import java.util.concurrent.TimeUnit;

/**
 * @Author shenmeng
 * @Date 2020/7/18
 **/
public class OtherServiceImpl implements OtherService {

    // 耗时操作
    private void sleep(String method) {
        // 记录开始时间
        long startTime = System.currentTimeMillis();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long endTime = System.currentTimeMillis();
        long useTime = endTime - startTime;
        System.out.println(method + "方法执行用时：" + useTime);
    }

    @Override
    public String doFirst() {
        sleep("doFirst()");
        return "doFirst()";
    }

    @Override
    public String doSecond() {
        sleep("doSecond()");
        return "doSecond()";
    }

    @Override
    public String doThird() {
        sleep("doThird()");
        return "doThird()";
    }

    @Override
    public String doFourth() {
        sleep("doFourth()");
        return "doFourth()";
    }
}
