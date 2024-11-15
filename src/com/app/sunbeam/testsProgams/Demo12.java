package com.app.sunbeam.testsProgams;

class empty {
	int a;
	
	public empty(int a) {
		this.a=a;
	}
	
	public void show() {
		System.out.println(this.a);
	}
}

class patch extends empty{
	int b;
	
	public patch(int a,int b) {
		super(a);
		this.b=b;
	}
	
	public void show() {
		System.out.println(this.b);
	}
	public void faltu() {
		System.out.println(this.b);
	}
	
}

public class Demo12 {

	public static void main(String[] args) {
		empty e = new patch(20, 30);
		e.show();
	}
}
