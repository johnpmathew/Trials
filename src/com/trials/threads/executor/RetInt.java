package com.trials.threads.executor;

import java.util.Calendar;
import java.util.concurrent.Callable;

class RetInt implements Callable<Integer> {

    RetInt() {
    }

    @Override
    public Integer call() throws InterruptedException {
        System.out.println("Entering retint" + Calendar.getInstance().getTime());
        Thread.sleep(3000);
        System.out.println("Exiting retint");
        return 1;
    }
}