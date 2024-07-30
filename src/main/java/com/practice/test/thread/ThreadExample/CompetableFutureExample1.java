package com.practice.test.thread.ThreadExample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompetableFutureExample1 {

    private static final ExecutorService service = Executors.newFixedThreadPool(10);

    private static CompletableFuture<String> fetchData(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Data fetched successfully");
            return "Data fetched successfully :"+userId;
        },service);
    }

    private static CompletableFuture<String> process(String data) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Data has been processed successfully");
            return "Data has been processed successfully";
        },service);
    }

    private static CompletableFuture<String> payment(String payment) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Payment has been completed");
            return "Payment has been completed";
        },service);
    }

    public static void main(String[] args) {
        fetchData("123").thenCompose(data->process(data))
                .thenAccept(payment->process(payment))
                .exceptionally(ex->{
                    System.out.println("Logged the exception successfully");
                    return null;
                }).join();
    }

    /*
    * - analyse (how much amount of data, kiti la parwdu shakte)
    * - loan
    * - leverage for future loan
    * - one loan clear (then can get able to loan from bank)
    * -
    * */
}
