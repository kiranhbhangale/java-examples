package com.classobjects;

//A parameterized constructor. 

class MyClassWithParamCon {
	int x;

	MyClassWithParamCon(int i) {
		x = i;
	}
}

public class ParmConsDemo {
	public static void main(String[] args) {
		MyClassWithParamCon t1 = new MyClassWithParamCon(10);
		MyClassWithParamCon t2 = new MyClassWithParamCon(88);

		System.out.println(t1.x + " " + t2.x);
	}
}