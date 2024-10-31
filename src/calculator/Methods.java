package calculator;

public class Methods 
{
	
	

	
	
	
	public static void main(String[] args) {
		
		int a =10;
		
		int b =10;
		Methods met =new Methods();
	    //	met.run();
		//met.eat();
		//met.sleep();
		
		met.add(a,b);
		
	}
	
	
	
	public void add(int a, int b) 
	{

		int c = a+b;
		
		System.out.println("the addition of a and b is "+c);
		
	}
	
	
	public void run() 
	{
		
		System.out.println("the function is running");
		
	}
	
	public void sleep() 
	{
		System.out.println("the function is sleeping");
	}
	
	public void eat() 
	{
		System.out.println("the function is eating");
	}
	
}
