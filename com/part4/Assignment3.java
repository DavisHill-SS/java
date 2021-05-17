package com.part4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		Integer size = 20;
		
		Consumer consumer = new Consumer(q, size);
		Producer producer = new Producer(q, size);
		
		producer.start();
		consumer.start();

	}

}

class Consumer extends Thread{
	private int size;
	private Queue<Integer> q;
	
	public Consumer(Queue<Integer> q, int size) {
		this.q = q;
		this.size = size;
	}
	
	public void run() {
		while(true) {
			synchronized(q) {
				while(q.isEmpty()) {
					try {
						q.wait();
					}
					catch (Exception e) {
						e.printStackTrace(); 
					}
				}
				
				System.out.println("Consumer consuming" + q.remove());
				q.notifyAll();
			}
		}

	}
}

class Producer extends Thread{
	private int size;
	private Queue<Integer> q;
	
	public Producer(Queue<Integer> q, int size) {
		this.q = q;
		this.size = size;
	}
	
	public void run() {
		while(true) {
			synchronized(q) {
				while(q.size() == size) {
					try {
						q.wait();
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				int produced = new Random().nextInt();
				
				System.out.println("Producer producing " + produced);
				q.add(produced);
				q.notifyAll();
			}
		}

	}
}
