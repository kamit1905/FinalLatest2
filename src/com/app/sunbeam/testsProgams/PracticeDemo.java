package com.app.sunbeam.testsProgams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PracticeDemo {

	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<>();
		List<Integer> lis1 = new ArrayList<>();
		List<Integer> lis2 = new ArrayList<>();
		lis.add(2);
		lis.add(5);
		lis.add(10);
		lis.add(5);
		lis.add(17);
		lis.add(2);
		lis.add(4);
		lis.add(29);
		lis.add(10);
		lis.add(6);
		lis.add(8);
		lis.add(11);
		lis.add(13);
		
		Iterator<Integer> itr = lis.iterator();
		
		while(itr.hasNext()) {
			Integer it = itr.next();
			if(!lis1.contains(it)) {
				lis1.add(it);
			}
		}
		
		System.out.println(lis1);
		
		for(int i=0;i<lis1.size();i++) {
			for(int j=0;j<lis1.size();j++) {
				if(lis1.get(i)<lis1.get(j)) {
					Integer tmp = lis1.get(i);
					lis1.set(i, lis1.get(j));
					lis1.set(j, tmp);
				}
			}
		}
		
		System.out.println(lis1);
		
		for(int i=0;i<lis1.size();i++) {
			int cnt2 = 0;
			for(int num = lis1.get(i);num>0;num--) {
				if(lis1.get(i)%num==0) {
					cnt2 = cnt2+1;
				}
			}
			
			if(cnt2==2) {
				lis2.add(lis1.get(i));
			}
		}
		
		System.out.println(lis2);
	}
}
