package com.velocity.git;

import java.util.Arrays;
import java.util.List;

public class ArrayListCheck 
{
	public static void addition()
	{
		System.out.println(10+20);
	}
	public static void main(String[] args) 
	{
		List<String> names=Arrays.asList("KIRAN","RAJ","AJAY","LADDU");
		for (String s : names) 
		{
			System.out.println(s);
		}
		addition();
	}
}
