package javaplay;

public class Greatest31 {
	public static void main(String[] args) 
	{
		int n1 = 110;
		int n2 = 25;
		int n3 = 1;
		if(n1 > n2)
		{ 
			if (n3 > n1)
			{
				System.out.println(n3+" is greater");
			}
			else
			{
				System.out.println(n1+" is greater");
			}
		}		
		else	
		{
			if (n3 > n2)
			{
				System.out.println(n3+" is greater");
			}
			else
			{
				System.out.println(n2+" is greater");
			}
		}		
	}

}
