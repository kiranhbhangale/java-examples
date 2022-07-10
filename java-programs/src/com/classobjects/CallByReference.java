package com.classobjects;

//Objects are passed through their references. 
class CBR {
	int a, b;

	CBR(int i, int j) {
		a = i;
		b = j;
	}

	/*
	 * Pass an object. Now, ob.a and ob.b in object used in the call will be
	 * changed.
	 */
	void change(CBR ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}

public class CallByReference {
	public static void main(String[] args) {
		CBR ob = new CBR(15, 20);

		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

		ob.change(ob);

		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}
}