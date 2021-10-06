package org.java;

public class Variables1 extends Variables {
	int a = 2000;
	public void add() {
		int a = 500;
		
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Variables1 s = new Variables1();
		s.add();
	}

}
