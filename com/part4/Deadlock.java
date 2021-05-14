package com.part4;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String s1 = "string one";
		final String s2 = "string two";
		
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized(s1) {
						System.out.println("Thread 1 locked s1");
						Thread.sleep(100);
						synchronized(s2){
							System.out.println("Thread 1 locked s2");
						}
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized(s2) {
						System.out.println("Thread 2 locked s2");
						Thread.sleep(100);
						synchronized(s1){
							System.out.println("Thread 2 locked s2");
						}
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		

	}

}
