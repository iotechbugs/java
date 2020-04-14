package com.sample.pkg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sample.pkg.threads.MyThread;

public class HelloWorld {

	private static final int THREAD_CONCURRENCY = 5;

	private static final int TOTAL_THREADS = 10;

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(THREAD_CONCURRENCY);
		for (int i = 0; i < TOTAL_THREADS; i++) {
			service.execute(new MyThread(" Thread : " + i));
		}
		service.shutdown();
	}

}
