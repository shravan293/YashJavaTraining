package com.example.topicString;

public class StringProcess {
	
	long startTime = 0l;
	long endTime = 0l;
	long timeDiff=0l;
	
	public void stringClass(String resp) {
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		resp=resp+" response";
		timeDiff=endTime-startTime;
		System.out.println("Time Taken by String:"+timeDiff);
	}
	
	public void stringBufferClass(StringBuffer resp) {
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		resp=resp.append(" response");
		timeDiff=endTime-startTime;
		System.out.println("Time Taken by StringBuffer:"+timeDiff);
	}
	
	public void stringBuilderClass(StringBuilder resp) {
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		resp=resp.append(" response");
		timeDiff=endTime-startTime;
		System.out.println("Time Taken by StringBuilder:"+timeDiff);
	}

}
