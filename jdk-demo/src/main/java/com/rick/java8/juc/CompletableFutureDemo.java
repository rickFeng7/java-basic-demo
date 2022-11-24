package com.rick.java8.juc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fengrui
 */
@Slf4j
public class CompletableFutureDemo {

    // 1.结果处理
    // 入参：返回结果、异常，无返回值
    @Test
    public void test_whenComplete() {
        CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() -> log.info("test_whenComplete: {}", "123"));
        CompletableFuture<Void> whenComplete = runAsync.whenComplete((unused, throwable) -> log.info("test_whenComplete: {}", "456"));
    }

    // 与complete区别：返回future & 可自定义返回future，与apply区别：可以处理异常
    @Test
    public void test_handle() {
        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> "123");
        CompletableFuture<Integer> handle = supplyAsync.handle((s, error) -> s.length());
        log.info("test_handle: {}", handle.join());
    }

    @Test
    public void test_exceptionally() {
        CompletableFuture<String> exceptionally = CompletableFuture.supplyAsync(() -> 1 / 0 + "").exceptionally(Throwable::getMessage);
        log.info("test_exceptionally: {}", exceptionally.join());
    }


    // 2.结果转换
    // 返回future
    @Test
    public void test_thenApply() {
        CompletableFuture<String> thenApply = CompletableFuture.supplyAsync(() -> "123").thenApply(s -> s);
        log.info("test_thenApply: {}", thenApply.join());
    }


    // thenApply转换的是泛型中的类型，相当于将CompletableFuture<T> 转换生成新的CompletableFuture<U>
    // thenCompose用来连接两个CompletableFuture，是生成一个新的CompletableFuture
    @Test
    public void test_thenCompose() {
        CompletableFuture<String> thenCompose = CompletableFuture.supplyAsync(() -> "123").thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "456"));
        log.info("test_thenCompose: {}", thenCompose.join());
    }


    // 3.结果消费
    // 无返回值，只是消费
    @Test
    public void test_thenAccept() {
        CompletableFuture<Void> thenAccept = CompletableFuture.supplyAsync(() -> "123").thenAccept(log::info);
        log.info("test_thenAccept: {}", thenAccept.join());
    }


    // 4.结果组合
    @Test
    public void test_thenCombine() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        CompletableFuture<List<Integer>> combine = CompletableFuture.supplyAsync(() -> list1, threadPool)
                .thenCombine(CompletableFuture.supplyAsync(() -> list2, threadPool), (a, b) -> {
                    List<Integer> list = new ArrayList<>();
                    list.addAll(a);
                    list.addAll(b);
                    return list;
                });
        // join无需处理异常，get需手动处理异常
        log.info("test_thenCombine: {}", combine.join());
    }


    // 5.任务交互
}
