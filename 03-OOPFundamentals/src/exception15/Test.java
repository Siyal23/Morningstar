package exception15;

class Test {
	public static void main(String[] args)
 {
 try
 {
 int a[]= {1, 2, 3, 4};
 for (int i = 1; i <= 4; i++)
 {
 System.out.println ("a[" + i + "]=" + a[i] + "n");
 }
 catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println("Array Index Invalid");
 }
 //only try is not allowed 
 }
 }
}