package com.frs;

public class MyRunnable implements Runnable {

	private boolean stop;

	@Override
	public void run() {

		for (int i = 0; i < 100 && !stop; i++) {
			System.out.println(Thread.currentThread().getName() + "->" + i);
		}

	}

	public void stopThread() {
		this.stop = true;
	}

}
