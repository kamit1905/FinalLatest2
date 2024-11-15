package com.app.sunbeam.testsProgams;

import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

//palindrome,remove duplicate,count number of characters,reverse eachword in string,Capatilise first letter of every character
//remove multiple white spaces,remove vowels from string,anagram,

public class InterDemo {
	
	int y = 2;
	int x = y+2;
	public static void main(String[] args) {
//		int [] arr = {1,5,6};
//		
//		int len = arr.length;
//		int cnt = 0;
//		for(int i=0;i<len;i++) {
//			if(i==len-1) {
//				arr[cnt++] = arr[i]+1;
//			}else {
//				arr[cnt++] = arr[i];
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		String str = "32400121200";
		char [] ch1 = str.toCharArray();
		int startIndex = 0;
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]=='0') {
				for(int j=i;j>startIndex;j--) {
					char c = ch1[j];
					ch1[j] = ch1[j-1];
					ch1[j-1] = c; 
				}
				startIndex++;
			}
		}
		
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
		}
		
		
		
		
//		int [] arr1 = {3,2,4,0,0,1,2,1,2,0,0};
//		int startIndex =0;
//		
//		for(int i=0;i<arr1.length;i++) {
//			if(arr1[i]==0) {
//				for(int j=i;j>startIndex;j--) {		//j=2
//					int temp = arr1[j];
//					arr1[j] = arr1[j-1];			//3 2 0 4  	  //arr[2] = arr[1]
//					arr1[j-1] = temp;
//				}
//				startIndex++;
//			}
//		}
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(arr1[i]+" ");
//		}
		System.out.println();
		String st = "eeeyeyyqqqqq";
		String st1 = "I know who  you are";
		//o/p = are you who know i
		
		StringTokenizer st2 = new StringTokenizer(st1);
		StringBuffer sb1 = new StringBuffer();
		while(st2.hasMoreElements()) {
			sb1 = sb1.append(st2.nextElement()).append(" ");
		}
		
		System.out.println(sb1);
		String word = "";
		String sp = sb1.toString();
		String [] sp2 = sp.split(" ");
		
		for(int i=sp2.length-1;i>=0;i--) {
			word = word + sp2[i]+" ";
		}
		
		System.out.println(word);
		
		int [] arr = {3,1,5,7,8,1};
		
		int len = arr.length;			//3 5 8
		int cnt = 0;
		for(int i=0;i<len;i++) {
			if(i%2==0) {
				arr[cnt++] = arr[i];
			}
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.print(arr[i]+" ");
		}
		
		String str3 = "JavaLearning2024";
		String word3 = "";
		for(int i=0;i<str3.length();i++) {
			if(Character.isDigit(str3.charAt(i))) {
				word3 = word3 +str3.charAt(i);
			}
		}
		
		System.out.println(word3);
		
		int cnt4;
		String str4 = "hello";
		String word4 = "";
		for(int i=0;i<str4.length();i++) {
			cnt4=0;
			while(cnt4<2) {
				word4 = word4 + str4.charAt(i);
				cnt4++;
			}
			
		}
		
		System.out.println("twice word "+word4);
	
		int [] arr5 = {5,1,8,4,9,1,5};
		int cnt5 = 0;
		
		for(int i=0;i<arr5.length;i++) {
			for(int j=0;j<arr5.length;j++) {
				if(arr5[i]<arr5[j]) {
					int tmp = arr5[i];
					arr5[i] = arr5[j];
					arr5[j] = tmp;
				}
			}
		}
		
		for(int i=0;i<arr5.length-1;i++) {
			if(arr5[i]!=arr5[i+1]) {
				arr5[cnt5++] = arr5[i];
			}
		}
		
		arr5[cnt5++] = arr5[arr5.length-1];
		
		int result = 0;
		for(int i=0;i<cnt5;i++) {
			result = result +arr5[i];
		}
		
		System.out.print(result + " ");
		
		String a = "hello";
		String b = "world";
		
		a = a+b;		//helloworld
		b = a.substring(0,a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		//print prime number from 1 to 30

		int no = 30;
		for(int i=0;i<no;i++) {
			isPrime(i);
		}
		
		String str7 = "minim";
		int distinct = 0;
		
		for(int i=0;i<str7.length();i++) {
			for(int j=0;j<str7.length();j++) {
				if(str7.charAt(i)==str7.charAt(j)) {
					distinct++;
				}
			}
			
			if(distinct==1) {
				System.out.println(str7.charAt(i));
			}
		}
		
	}
	
	public static void isPrime(int no) {
		//int i=lis.get(i)
		//int num = lis.get(i)
		//if(num%i==0)
		//3
		int cnt;
	//	for(int i=1;i<no;i++) {
			cnt=0;
			for(int j=no;j>0;j--) {
				if(no%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.print(no+" ");
			}
		//}
	}
	
	public static String returnMiddleString(String str) {
		// % will get reminder
		// / will get quotient   //4 4-1 4+1
		int len = str.length()/2;
		return str.substring(len-1, len+1)+str.substring(len,len+0)+str.substring(len+1,len+2);
	}
	
}

//A***
//Am**
//Ami*
//Amit

//A A A A A
//B B B B
//C C C
//D D
//E

//A
//B B
//C C C
//D D D D
