package com.frs.locktest;

public class Ticket implements Runnable {

	private int num ;
	private Boolean flag = true;
	
	public Ticket (int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		while(flag) {
			ticket();
		}
	}

	private void ticket() {
		if(num <= 0) {
			flag =false;
			return ;
		}
		try {
			Thread.sleep(20);
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + "售出票序列号：" + num--);
	}

}
