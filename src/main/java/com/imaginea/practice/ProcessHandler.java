package com.imaginea.practice;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author sudheerp
 *
 */
public class ProcessHandler {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        ProcessBuilder builder=new ProcessBuilder("notepad.exe");
        Process process=builder.start();
        ProcessHandle processHandle=process.toHandle();
        System.out.println("pid::"+processHandle.pid());
        Thread.sleep(1000);
        processHandle.destroy();
        CompletableFuture<ProcessHandle> future = processHandle.onExit();
        ProcessHandle ph = future.get();
        System.out.printf("isAlive: %s%n", ph.isAlive());
    }
}
