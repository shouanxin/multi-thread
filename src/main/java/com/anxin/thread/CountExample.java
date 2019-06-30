/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/6 15:06.
 */

package com.anxin.thread;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 〈计数〉.
 *
 * @author: shouanxin
 * @date: 2019/4/6
 */
@Slf4j
public class CountExample {
    private static int threadTotal = 200;
    private static int clientTotal = 5000;

    private static long count = 0;

    @Test
    public void testCount() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (Exception e) {
                    log.error("exception, ", e);
                }
            });
        }
        executorService.shutdown();
        log.info("count:{}", count);
    }

    private void add() {
        count++;
    }
}
