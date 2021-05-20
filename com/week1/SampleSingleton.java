package com.week1;
import java.sql.Connection;

import com.part4.Singleton;

public class SampleSingleton {
	private static Connection conn = null;
	private static SampleSingleton instance = null;
	
	public static synchronized SampleSingleton getInstance(Connection sql_conn) {
		if (instance == null) {
			conn = sql_conn;
			synchronized (SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}

}
