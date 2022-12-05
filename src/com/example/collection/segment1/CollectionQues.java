package com.example.collection.segment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.stream.Collectors;

public class CollectionQues {

	public static void main(String[] args) {
		
		
		//ascendingOrder();
		//binarySearch();
		//removeDuplNumNDAsc();
		//removeDuplListNDDsc();
		//sortDataUsingVector();
		sortDataUsingMap();
		
		
	}
	
	public static List<Integer> CollectionList() {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);   
		numList.add(5);
		numList.add(3);
		numList.add(3);
		numList.add(2);
		numList.add(7);
		numList.add(5);
		
		return numList;
	}
	
	public static void ascendingOrder() {
		 List<Integer> numList = CollectionList();
		 List<Integer> ascNL = numList.stream().sorted().collect(Collectors.toList());
		 System.out.print("Ascending List:");
		 ascNL.forEach(n->System.out.print(" "+n));
	}
	
	public static void removeDuplListNDDsc() {
		   List<String> itemlist = Arrays.asList("samsung30s","apple13","samsung30s","mi","pockko","pockko");
		   List<String> desitemList = itemlist.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		   System.out.println(desitemList);
	}
	
	public static void sortDataUsingVector() {
		   List<String> itemlist = Arrays.asList("samsung30s","apple13","samsung30s","mi","pockko","pockko");
		   Vector vlist=new Vector(itemlist);
		   Collections.sort(vlist);
		   System.out.println(vlist);
	}
	
	public static void sortDataUsingMap() {
		   Map<String,Long> obj=new HashMap<String,Long>();
		   obj.put("Mumbai",(long) 12442373);
		   obj.put("Pune",(long) 3124458);
		   obj.put("Nagpur",(long) 2405665);
		   obj.put("Thane",(long) 1841488);
		   obj.put("PCMC",(long) 1727692);
		   obj.put("Nashik",(long) 1486053);
		   
		   Map<String,Long> sortObj=new TreeMap<>();
		   sortObj.putAll(obj);
		   
		   for(Map.Entry<String, Long> entry:sortObj.entrySet()) {
			   System.out.println(entry.getKey()+" "+entry.getValue());
		   }
	}
	
	public static void binarySearch() {
		
		List<Integer> numList = CollectionList();
		List<Integer> ascNL = numList.stream().sorted().collect(Collectors.toList());
		int[] numArray = ascNL.stream().mapToInt(Integer::intValue).toArray();

		int key = 3;
	    System.out.println("Key to be searched=" + key);
	    int first = 0;
	    int last=numArray.length-1; 
	    int mid = (first + last)/2;  
	    while( first <= last ){  
	        if ( numArray[mid] < key ){  
	            first = mid + 1;     
	        }else if ( numArray[mid] == key ){ 
	            System.out.println("Element is found at index: " + mid);  
	            break;  
	        }else{  
	            last = mid - 1;  
	        }  
	        mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }  
	}
	
	public static void removeDuplNumNDAsc(){
			List<Integer> dupList = CollectionList();
			List<Integer> collect = dupList.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(collect);
	   }
}
