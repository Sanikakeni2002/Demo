package com.java;

import java.util.Calendar;

public class BufferBuilder_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.gc();
		StringBuilder stringBuilder = new StringBuilder("Vikram");
		long startTime1 = Calendar.getInstance().getTimeInMillis();
		for (long i = 0; i < 10000000; i++) {
			stringBuilder.append(i);
		}
		long endTime1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken for 10000000 appends for StringBuilder:" + (endTime1 - startTime1) + " ms");

		System.gc();
		StringBuffer stringBuffer = new StringBuffer("Piyu");
		long startTime2 = Calendar.getInstance().getTimeInMillis();
		for (long i = 0; i < 10000000; i++) {
			stringBuilder.append(i);
		}
		long endTime2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken for 10000000 appends for StringBuffer:" + (endTime2 - startTime2) + " ms");

	}

}
