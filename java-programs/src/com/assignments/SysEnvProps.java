package com.assignments;

public class SysEnvProps {
	public static void main(String[] args) {
		System.out.println("\nCurrent system environment:");
		System.out.println(System.getenv());
		System.out.println("\n\nCurrent system properties:");
		System.out.println(System.getProperties());
	}
}