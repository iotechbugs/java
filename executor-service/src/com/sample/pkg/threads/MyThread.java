package com.sample.pkg.threads;

import java.util.Random;

public class MyThread implements Runnable {

	private String value;

	public MyThread(String v) {
		this.value = v;
	}

	private int max = 40, min = 20;

	@Override
	public void run() {
		randomSleep();
	}

	private void randomSleep() {
		Random rand = new Random();
		int millis = (rand.nextInt(max - min + 1) + min) * 1000;
		try {
			System.out.println("Starting thread name : " + value + ", will sleep for : " + millis + " ms");
			Thread.sleep(millis);
			System.out.println("Completed thread name : " + value + ", after " + millis + " ms...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
