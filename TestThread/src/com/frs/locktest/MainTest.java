package com.frs.locktest;

public class MainTest {
	public static void main(String[] args) {
		Ticket ticket = new Ticket(10);
		Thread win01 = new Thread(ticket, "win01");
		Thread win02 = new Thread(ticket, "win02");
		Thread win03 = new Thread(ticket, "win03");
		win01.run();
		win02.run();
		win03.run();
	}
}
