package com.practice.test.thread.ThreadExample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompetableFutureExample {

    private static final ExecutorService service = Executors.newFixedThreadPool(10);

    private static CompletableFuture<String> fetchData(String userId){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("provide logic to fetch data===>");
            return "fetched data successfully for userId :"+userId;
        },service);
    }

    CompletableFuture<String> fetchData1(String userID){
        return CompletableFuture.supplyAsync(()->{
            return null;
        },service);
    }

    private static CompletableFuture<String> processData(String data){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("provide logic to process data===>");
            return "data process successfully";
        },service);
    }

    private static CompletableFuture<String> saveData(String processedData){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("provide logic to save data===>");
            return "Data save successfully in DB "+processedData;
        },service);
    }

    public static void main(String[] args) {
        fetchData("123")
                .thenCompose(data->processData(data))
                .thenCompose(processedData->saveData(processedData))
                .exceptionally(ex->{
                    return null;
                })
                .join();
    }
}
