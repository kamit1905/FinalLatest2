package com.app.sunbeam.tests;

public class Pack1 {

	public static void main(String[] args) {
//		int n1=0,n2=1,n3;
//		
//		System.out.print(n1+" "+n2 +" ");
//		for(int i=2;i<7;i++) {
//			if(i>=5 && i<=7) {
//				n3=n1+n2;
//				System.out.print(n3+" ");
//				n1=n2;
//				n2=n3;		
//			}else {
//				n3=n1+n2;
//				//System.out.print(n3+" ");
//				n1=n2;
//				n2=n3;		
//			}
//		}
	
		for(int i=0;i<40;i++) {
			int cnt=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0)
					cnt = cnt+1;
			}
			if(cnt==2) {
				System.out.print(i+" ");
			}
		}
	}
}
