package com.app.sunbeam.testsProgams;

import java.util.*;
import java.util.Map.Entry;

public class Demo1 {
	
	public static void main(String[] args) {
		
//		String str= "nitin";
//		char [] ch = str.toCharArray();
//		int len = str.length();
//		String str1 = removeDuplicate(ch, len);
//		System.out.println("str1========"+str1);
		
//		String str1 = "Noting is    impossible    where to find    looks";
//		StringTokenizer st = new StringTokenizer(str1, " ");
//		
//		StringBuffer sb = new StringBuffer();
//		while(st.hasMoreElements()) {
//			sb.append(st.nextElement()).append(" ");
//		}
//		
//		System.out.println("contains one space "+sb);
		

		//find prime number between 20-80
//		int start=50; int end=80;
//		
//		for(int i=start;i<end;i++) {
//			int cnt=0;
//			for(int j=i;j>=1;j--) {
//				if(i%j==0) {
//					cnt= cnt+1;
//				}
//			}
//			
//			if(cnt==2) {
//				System.out.println("given number "+i +" is prime");
//			}
//		}

		//Find the sum of digits in given string
//		String str = "ntin3987raje";int num=0;
//		
//		for(int i=0;i<str.length();i++) {
//			boolean status = isChar(str.charAt(i));
//			if(status) {
//				num=num+Integer.parseInt(String.valueOf(str.charAt(i)));
//			}
//		}
//		System.out.println("sum is "+num);

	//Check two string are anagram with each other
		
//		String str1= "amit";
//		String str2= "tmia";
//		
//		if(str1.length()==str2.length()) {
////			char [] ch1 = str1.toCharArray();
////			char [] ch2 = str2.toCharArray();
//			char [] ch1 = sortCharacterArray(str1.toCharArray());
//			char [] ch2 = sortCharacterArray(str2.toCharArray());
////			Arrays.sort(ch1);
////			Arrays.sort(ch2);
//			
//			boolean status = Arrays.equals(ch1, ch2);
//			if(status) {
//				System.out.println("both are anagram with each other");
//			}else {
//				System.out.println("both are not anagram");
//			}
//			
//		}else {
//			System.out.println("both are not anagram with");
//		}

//		int n1=20;int n2=7;
//		n1=n1+n2;		//27
//		n2=n1-n2;		//27-7  20
//		n1=n1-n2;		//27-20  7
//		System.out.println("n1 "+n1);
//		System.out.println("n2 "+n2);
		
//		String str = "amit";
//		String str1 = "patil";
//		str = str+str1;		//amitpatil
//		str1= str.substring(0,str.length()-str1.length());   //4
//		str = str.substring(str1.length());
//		System.out.println("str "+str);
//		System.out.println("str1 "+str1);

//		String [] arr = {"amit khambad","mukesh yadav","balu mohite","kedar shinde"};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i].compareTo(arr[j])>1) {
//					String str = arr[i];
//					arr[i]=arr[j];
//					arr[j]=str;
//				}
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	
//	 String str = "nitin";
//	 char [] ch =str.toCharArray();
//	 
//	 Map<Character,Integer> mp = new HashMap<>();
//	 for(char c : ch) {
//		 if(mp.containsKey(c)) {
//			 mp.put(c, mp.get(c)+1);
//		 }else {
//			 mp.put(c, 1);
//		 }
//	 }
//	 
//	 for(Map.Entry<Character, Integer> map : mp.entrySet()) {
//		 System.out.println(map.getKey() + " " +map.getValue());
//	 }
	 //System.out.println("hashmap "+mp);

//		String str = "niatitny";		
//		for(int i=0;i<str.length();i++) {
//			int cnt=0;
//			for(int j=0;j<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					cnt=cnt+1;
//				}
//			}
//			if(cnt==1)
//				System.out.println(str.charAt(i));
//			
//			//String d = String.valueOf(str.charAt(i));
//			//str= str.replace(d, "");
//		}
		
		
		//sort hashmap based on value
//		Map<Integer,String> map = new HashMap<>();
//		map.put(2, "Two");
//		map.put(1, "Apple");
//		map.put(3, "Cat");
//		map.put(4, "Ball");
//		
//		List<Map.Entry<Integer, String>> lis = new ArrayList<>(map.entrySet());
//		
//		Collections.sort(lis,new Comparator<Map.Entry<Integer, String>>(){
//			public int compare(Map.Entry<Integer, String> o1,Map.Entry<Integer, String> o2) {
//				return o1.getValue().compareTo(o2.getValue());
//			}
//			
//		});
//		
//	
//		Map<Integer,String> mu = new LinkedHashMap<>();
//		for(Map.Entry<Integer, String> mp : lis) {
//			mu.put(mp.getKey(), mp.getValue());
//		}
//		
//		for(Map.Entry<Integer, String> mp : mu.entrySet()) {
//			System.out.println(mp.getKey()+" "+mp.getValue());
//		}
		
		/*
		 * Pattern printing program starts here
		 */
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=5;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//Traingle pattern
//		for(int i=5;i>0;i--) {
//			for(int j=1;j<i;j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k=5;k>=i;k--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//Half diamod pattern
//		int number=4;
//		int m,n;
//		
//		for(m=1;m<=number;m++) {
//			for(n=1;n<=number-m;n++) {
//				System.out.print(" ");
//			}
//			
//			for(n=1;n<=m*2-1;n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(m=number-1;m>0;m--) {
//			for(n=1;n<=number-m;n++) {
//				System.out.print(" ");
//			}
//			
//			for(n=1;n<=m*2-1;n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}


//		String str = "Amit";
//		int len = str.length()-1;
		
//		for(int i=0;i<=len;i++) {
//			int j;
//			for(j=i;j<len;j++) {
//				System.out.print("*");
//			}
//			
//			for(int k=len-i;k<=len;k++) {
//				System.out.print(str.charAt(k));
//			}
//			
//			System.out.println();
//		}
		
//		for(int i=0;i<=len;i++) {			
//			for(int k=0;k<len-i;k++) {
//				System.out.print(str.charAt(k));
//			}
//			
//			for(int l=len;l>=len-i;l--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int num =5;
//		for(int i=0;i<num;i++) {
//			for(int j=i;j<num;j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k=num-i;k<=num;k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

//	 int number = 4;
//	 int m,n;
//	 
//		for (m = 1; m <= number; m++) {
//			for (n = 1; n <= number - m; n++) {
//				System.out.print(" ");
//			}
//
//			for (n = 1; n <= m * 2 - 1; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(m=number;m>0;m--) {
//			for(n=1;n<=number-m;n++) {
//				System.out.print(" ");
//			}
//			
//			for(n=1;n<=m*2-1;n++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		//Mirred Right angle triangle
//		int row=5;
//		int i,j;
//		for(i=0;i<row;i++) {
//			for(j=2*(row-i);j>0;j--) {
//				System.out.print(" ");
//			}
//			
//			for(j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//Downard triangle star pattern
//		int row=5;
//		int i,j;
//		
//		for(i=0;i<row;i++) {
//			for(j=row-i;j>0;j--) {
//				System.out.print("* ");
//			}
//			
//			for(j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		//pyramid star pattern
//		int row= 5;
//		int i,j;
//		
//		for(i=0;i<row;i++) {
//			for(j=0;j<row-i;j++) {
//				System.out.print(" ");
//			}
//			
//			for(j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}

		/*
		 * Number pattern printing program
		 */
//	 int row =5;
//	 int i,j; int num;
//	 
//		for (i = 0; i < row; i++) {
//			num = 1;
//			for (j = 0; j <= i; j++) {
//				System.out.print(num++ +" ");
//			}
//			System.out.println();
//		}
		
//		int row=5;
//		int i,j; int num=1;
//		
//		for(i=0;i<row;i++) {
//			for(j=0;j<=i;j++) {
//				System.out.print(num++ +" ");
//			}
//			System.out.println();
//		}
		
//		int row=5;
//		int i,j;
//		
//		for(i=1;i<=row;i++) {
//			for(j=1;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		//Pascal number triangle
		int row=6;			
		int i,j;
		
		for(i=0;i<row;i++) {
			int num=1;
			System.out.printf("%"+2*(row-i)+"s","");
			for(j=0;j<=i;j++) {
				System.out.printf("%4d",num);
				num = num*(i-j)/(j+1);
			}
			System.out.println();
		}
		
		int num1 = 12321;
		int act = num1;
		int rev=0;
		int n1;
		while(num1>0) {
			n1=num1;
			n1=n1%10;
			rev=rev*10+n1;
			num1=num1/10;
		}
		System.out.println("rev "+rev);
		
		if(act==rev) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not palindrome");
		}
		
		
	}
	
	public static char[] sortCharacterArray(char [] ch) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch[i]<ch[j]) {
					char c = ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
		}
		return ch;

	}
	
	public static boolean isChar(char ch) {
		if(Character.isDigit(ch)) {
			return true;
		}else {
			return false;
		}
	}


	public static String removeDuplicate(char [] c,int len) {
		int cnt=0;
		for(int i=0;i<len;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(c[i]==c[j]) {
					break;
				}
			}
			if(i==j) {
				c[cnt++]=c[i];
			}
		}
		return String.valueOf(Arrays.copyOf(c, cnt));
	}
	
}
