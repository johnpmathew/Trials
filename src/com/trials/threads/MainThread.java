package com.trials.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Double> retdouble = service.submit(new RetDouble());
        Future<Integer> retInt = service.submit(new RetInt());
        try {
            System.out.println(retdouble.get());
            System.out.println(retInt.get());
        } catch (InterruptedException |ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }
}
