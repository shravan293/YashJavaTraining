package com.example.topicString;

public class StringQues {

	public static void main(String[] args) {
		
		//alphabetString();
		//removeVowels();
		
		//stringProcessDemostrate();
		
		int count=1;
		String str="shravan";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)<str.charAt(j+1)) {
					count++;
				}
			}
		}
	}
	
	public static void alphabetString() {
		char chTemp;
		String s="shravan";
		char[] str = s.toCharArray();
		int len = str.length;

		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(str[j]>str[j+1]) {
					chTemp=str[j];
					str[j]=str[j+1];
					str[j+1]=chTemp;
				}
			}	
		}
		System.out.print("Ascending String: ");
		System.out.println(str);
				
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(str[j]<str[j+1]) {
					chTemp=str[j];
					str[j]=str[j+1];
					str[j+1]=chTemp;
				}
			}	
		}
		System.out.print("Descending String: ");
		System.out.println(str);
	}
	
	public static void removeVowels() {
		String s="HOW are you shravan..i think e-learn";
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
			   s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				continue;
			}else {
				System.out.print(s.charAt(i));
			}
			
		}
	}
	
	public static void stringProcessDemostrate() {
		StringProcess sp=new StringProcess();
		
		//String s1="your";
		String s1=new String("your");
		sp.stringClass(s1);
		
		StringBuffer sb=new StringBuffer("your");
		sp.stringBufferClass(sb);
		
		StringBuilder sbi=new StringBuilder("your");
		sp.stringBuilderClass(sbi);
	}
}
