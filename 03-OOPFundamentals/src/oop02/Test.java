package oop02;


class A{
	public void print() {
		System.out.println("Class A");
	}
	public Object print4() {
		System.out.println("Class A");
		return null;
	}
}

class B extends A{
	public void print() {
		System.out.println("Class B");
	}
	public B print4() {
		System.out.println("Class B");
		return null;
	}
}


public class Test {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();
	}

}
