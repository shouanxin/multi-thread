/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/18 10:16.
 */

package com.anxin.thread;

import javax.sound.midi.Soundbank;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/4/18
 */
public class MyThread extends Thread {
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     */
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep，进入catch");
            e.printStackTrace();
        }
    }
}
