/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/18 10:20.
 */

package com.anxin.thread;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/4/18
 */
public class Run {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("main end");
    }
}
