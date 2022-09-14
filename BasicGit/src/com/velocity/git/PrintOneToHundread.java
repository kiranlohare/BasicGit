package com.velocity.git;

public class PrintOneToHundread 
{
	public static void printOneToHundread() 
	{
		int x=11;
		for (int i = 1; i <= 100; i++) 
		{
			if(i==x)
			{
				System.out.println();
				x=x+10;
			}
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) 
	{
		printOneToHundread();
	}
}
