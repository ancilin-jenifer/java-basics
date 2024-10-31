package calculator;

public class Condtional
{
	
	
	public static void main(String[] args) {
		
		
		int age =10;
		
		
		if(age>21)
		{
			
			System.out.println("you can apply for this job");
		}
		else if(age>=18 && age<21) 
		{
			System.out.println("wait for one more year you ,can apply for this job");
			
		}
		else 
		{
			System.out.println("you are not eligible");
		}
		
	}

}
