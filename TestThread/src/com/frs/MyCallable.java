package com.frs;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int i = 0;

	// 与run()方法不同的是，call()方法具有返回值
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			sum += i;
		}
		return sum;
	}
}
