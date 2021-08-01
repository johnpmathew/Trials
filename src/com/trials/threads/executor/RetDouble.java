package com.trials.threads.executor;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

class RetDouble implements Callable<Double> {

    RetDouble() {
    }

    @Override
    public Double call() throws Exception {
        System.out.println("Entering retdouble" + Calendar.getInstance().getTime());
        Thread.sleep(2000);
        System.out.println("Exiting retdouble");
        return 2.0;
    }
}
