package com.rick.java8.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fengrui
 */
public class CompletableFutureDemo {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        // 1.结果处理
        // test_whenComplete(threadPool);
        // test_handle(threadPool);
        // test_exceptionally(threadPool);

        // 2.结果转换
        // test_thenApply(threadPool);
        // test_thenCompose(threadPool);

        // 3.结果消费
        // test_thenAccept(threadPool);

        // 4.结果组合
        // test_thenCombine(threadPool);

        // 5.任务交互
    }

    // 入参：返回结果、异常，无返回值
    private static void test_whenComplete(ExecutorService threadPool) {
        CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() -> System.out.println("123")).whenComplete((unused, throwable) -> System.out.println("456"));
    }

    // 与complete区别：返回future & 可自定义返回future，与apply区别：可以处理异常
    private static void test_handle(ExecutorService threadPool) {
        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> "123");
        CompletableFuture<Integer> handle = supplyAsync.handle((s, error) -> s.length());
        System.out.println(handle.join());
    }

    private static void test_exceptionally(ExecutorService threadPool) {
        CompletableFuture<String> exceptionally = CompletableFuture.supplyAsync(() -> 1 / 0 + "").exceptionally(Throwable::getMessage);
        System.out.println(exceptionally.join());
    }


    // 返回future
    private static void test_thenApply(ExecutorService threadPool) {
        CompletableFuture<String> thenApply = CompletableFuture.supplyAsync(() -> "123").thenApply(s -> s);
        System.out.println(thenApply.join());
    }

    // thenApply转换的是泛型中的类型，相当于将CompletableFuture<T> 转换生成新的CompletableFuture<U>
    // thenCompose用来连接两个CompletableFuture，是生成一个新的CompletableFuture
    private static void test_thenCompose(ExecutorService threadPool) {
        CompletableFuture<String> thenCompose = CompletableFuture.supplyAsync(() -> "123").thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "456"));
        System.out.println(thenCompose.join());
    }


    // 无返回值，只是消费
    private static void test_thenAccept(ExecutorService threadPool) {
        CompletableFuture<Void> thenAccept = CompletableFuture.supplyAsync(() -> "123").thenAccept(System.out::println);
        System.out.println(thenAccept.join());
    }

    private static void test_thenCombine(ExecutorService threadPool) {
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
        System.out.println(combine.join());
    }
}
