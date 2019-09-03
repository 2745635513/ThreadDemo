package com.frs;

public class ThreadTest {

	public static void main(String[] args) {
		// 执行的是mythread的run方法线程执行体
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "<-" + i);
			if(i == 30) {
				Thread t1 = new MyThread();//将runnable作为thread target创建新的线程
				Thread t2 = new MyThread();
				t1.start();//进入就绪状态
				t2.start();
			}
		}
//		Runnable myRunnable = new MyRunnable(); // 创建一个Runnable实现类的对象
//		Thread thread = new Thread(myRunnable);
//		// 执行的是mrunnable的run方法线程执行体
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName() + " <-" + i);
//			
//			if (i == 30) {
//				thread.start();
//			}
//			if (i == 40) {
//				((MyRunnable) myRunnable).stopThread();
//			}
//		}
//		}
		// 创建线程
//		Callable<Integer> myCallable = new MyCallable(); // 创建MyCallable对象
//		FutureTask<Integer> ft = new FutureTask<Integer>(myCallable); // 使用FutureTask来包装MyCallable对象
//
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName() + " " + i);
//			if (i == 30) {
//				Thread thread = new Thread(ft); // FutureTask对象作为Thread对象的target创建新的线程
//				thread.start(); // 线程进入到就绪状态
//			}
//		}
//
//		System.out.println("主线程for循环执行完毕..");
//
//		try {
//			int sum = ft.get(); // 取得新创建的新线程中的call()方法返回的结果
//			System.out.println("sum = " + sum);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		}
	}
}
