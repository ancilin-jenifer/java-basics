package calculator;

public class Demo {
 
	 int a=26;
	 int b=30;
 public void addition(){
	 
	 int add=a+b;
	 System.out.println(add);
	 
}
 public void subtraction(){
	int sub=a-b;
	System.out.println(sub);
 }
 public void multiplication() {
	 int multi=a*b;
	 System.out.println(multi);
 }
  public void division() {
	  int div=a/b;
	  System.out.println(div);
  }
  public static void main(String args[])
  {
  Demo obj=new Demo();
  obj.addition();
  obj.subtraction();
  obj.multiplication();
  obj.division();
 }
}
