package lamda1;

@FunctionalInterface
interface I1{
	/*
	 * 1.Functional interface has only one method
	 * 2.Functional interface can have default method.
	 * 3.Functional interface can have a static method.
	 * */
	void meth1();
	default void meth2() {
		System.out.println("Default method");
	}
	
	static void meth3() {
		System.out.println("static method");
	}
}

class C1 implements I1{

	@Override
	public void meth1() {
		System.out.println("Overriden interface method");
		
	}
	
}
public class Test{

	public static void main(String[] args) {
		/*
		 * Traditional way of making an object.*/
		I1 obj=new C1();
		obj.meth1();
		/*
		 * Second way is implementing anonymous inner class
		 * */
		I1 obj2=new I1() {
			
			@Override
			public void meth1() {
				System.out.println("Implemented interface method using anonymous inner class");
			}
		};
		obj2.meth1();
		
		/*
		 * Lambda Expression
		 * */
		I1 obj3 = () -> System.out.println("implemented interface method using lambda expression");
		obj3.meth1();
	}

}
