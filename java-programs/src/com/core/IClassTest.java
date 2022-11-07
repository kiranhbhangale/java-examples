package com.core;

interface IClass {
	public class MyClass{
		public String foo() {
			return "Foo";
		}
	}
}

public class IClassTest {
	public static void main(String[] args) {
		System.out.println(new IClass.MyClass().foo());
	}
}