package com.classobjects;

//Objects are passed through their references. 
class CBR1 {
	int a, b;

	CBR1(int i, int j) {
		a = i;
		b = j;
	}

	/*
	 * Pass an object. Now, ob.a and ob.b in object used in the call will be
	 * changed.
	 */
	void change(CBR1 ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
	
	void change1(CBR1 ob1, CBR1 ob) {
		ob1=ob;
		System.out.println("ob1.a and ob1.b after call: " + ob1.a + " " + ob1.b);
		
	}
}

public class CallByReference2 {
	public static void main(String[] args) {
		CBR1 ob = new CBR1(15, 20);
		
		CBR1 ob1 = new CBR1(105, 200);

		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

		ob.change(ob);

		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
		
		
		System.out.println("ob1.a and ob1.b before call: " + ob1.a + " " + ob1.b);

		ob1.change1(ob1, ob);

		System.out.println("ob1.a and ob1.b after call: " + ob1.a + " " + ob1.b);
	}
}