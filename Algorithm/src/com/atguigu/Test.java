package com.atguigu;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

	ConcurrentHashMap c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock reentrantLock = new ReentrantLock();
		Thread thread1 = new Thread_tryLock(reentrantLock);
		thread1.setName("thread1");
		thread1.start();

		Thread thread2 = new Thread_tryLock(reentrantLock);
		thread2.setName("thread2");
		thread2.start();

//		Thread thread = new Thread(new Test());

	}

	static class Thread_tryLock extends Thread {
		ReentrantLock reentrantLock;

		public Thread_tryLock(ReentrantLock reentrantLock) {
			this.reentrantLock = reentrantLock;
		}

		@Override
		public void run() {
			try {
				System.out.println("try lock:" + Thread.currentThread().getName());
				boolean tryLock = reentrantLock.tryLock(3, TimeUnit.SECONDS);

				if (tryLock) {

					System.out.println("try lock success :" + Thread.currentThread().getName());
					System.out.println("睡眠一下：" + Thread.currentThread().getName());
					Thread.sleep(5000);
					System.out.println("醒了：" + Thread.currentThread().getName());
				} else {
					System.out.println("try lock 超时 :" + Thread.currentThread().getName());
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("unlock:" + Thread.currentThread().getName());
//				reentrantLock.unlock();
			}
		}}



}
