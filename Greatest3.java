package javaplay;

public class Greatest3 {
	public static void main(String[] args) 
	{
		int n1 = 2;
		int n2 = 5;
		int n3 = 2;
		int a = 0;	
		if(n1 > n2)
		{ 
			a = n1;
		}		
		else	
		{
			a = n2;
		}
		
		if (n3 > a)
		{
            a = n3;
		}
		
			System.out.println(a+" is greater");


		
		
	}

}
