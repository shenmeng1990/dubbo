package com.alibaba.service;

import java.util.concurrent.CompletableFuture;

/**
 * @Author shenmeng
 * @Date 2020/7/18
 **/
public interface OtherService {

    String doFirst();
    String doSecond();

    CompletableFuture<String> doThird();
    CompletableFuture<String> doFourth();

}
