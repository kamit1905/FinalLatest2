package com.app.sunbeam.tests;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
	
	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<>();
		List<Integer> lis1 = new ArrayList<>();
		lis.add(2);
		lis.add(10);
		lis.add(20);
		lis.add(30);
		lis.add(10);
		lis.add(40);
		lis.add(20);
		lis.add(2);
		lis.add(5);
		lis.add(10);
		
		Set<Integer> sf = new LinkedHashSet<>(lis);
		System.out.println(sf);
		
		Iterator<Integer> itr = lis.iterator();
		while(itr.hasNext()) {
			Integer it = itr.next();
			if(!lis1.contains(it)) {
				lis1.add(it);
			}
		}
		
		System.out.println(lis1);
		
		int alpha = 65;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
		
		int[] arr5 = { 20, 10, 30, 20, 10, 40, 50, 50, 40, 30, 60, 60, 70, 80, 60, 70 };
		
		for(int i=0;i<arr5.length;i++) {
			for(int j=0;j<arr5.length;j++) {
				if(arr5[i]<arr5[j]) {
					int tmp = arr5[i];
					arr5[i] = arr5[j];
					arr5[j] = tmp;
				}
			}
		}
		
		for(int i=0;i<arr5.length;i++) {
			System.out.print(arr5[i] +" ");
		}
		
		int second = findSecondHighestElement(arr5);
		System.out.println("Second Highest Element "+second);
	}
	
	public static int findSecondHighestElement(int [] arr) {
		int distinct = 1;
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]!=arr[i+1]) {
				distinct = distinct + 1;
			}
			
			if(distinct==3) {
				return arr[i];
			}
		}
		
		return arr[arr.length-1];
		
	}

}

//A
//A B
//A B C
//A B C D
//A B C D E