package oop05;

public class Test {
	class A{
		public void show() {
			System.out.println("show method of A");
		}
		public A show2() {
			System.out.println("show2 method of A");
			return null;
		}
	}

	class B extends A{
		@Override
		public void show() {
			System.out.println("show method of B");
		}
		
		@Override
		public B show2() {
			System.out.println("show2 method of B");
			return null;
		}
	}
	 
		public static void main(String[] args) {
			/*A ref = new B();
			
			ref.show();
			ref.show2();
			System.out.println("----------------------------");
			ref = new A();
			ref.show();
			ref.show2();*/
		
	}

}
