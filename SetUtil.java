package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetUtil<T>
{
	public Set<Pen> chooseSetType()
	{
		Set<Pen> set = null;
		Scanner s = new Scanner(System.in);
		System.out.println("1. HashSet");
		System.out.println("2. LinkedHashSet");
		System.out.println("3. TreeSet");
		System.out.println("Choose any One Option...");
		int choice = s.nextInt();
		if(choice == 1)
			set = new HashSet<Pen>();
		else if(choice == 2)
			set = new LinkedHashSet<Pen>();
		else if(choice == 3)
		{
			System.out.println("1. Store the Elements Based On Brand");
			System.out.println("1. Store the Elements Based On Colour");
			System.out.println("1. Store the Elements Based On Cost");
			System.out.println("1. Store the Elements Based On Type");
			int option = s.nextInt();
			switch(option)
			{
			case 1 : CompareBasedOnBrand brand = new CompareBasedOnBrand();
					 set = new TreeSet<Pen>(brand);
			break;
			case 2 : CompareBasedOnColour color = new CompareBasedOnColour();
					 set = new TreeSet<Pen>(color);
			break;
			case 3 : CompareBasedOnCost cost = new CompareBasedOnCost();
					 set = new TreeSet<Pen>();
			break;
			case 4 : CompareBasedOnType type = new CompareBasedOnType();
					 set = new TreeSet<Pen>();
			break;
			default : System.out.println("Invalid Choice..");
					  set = new TreeSet<Pen>();
			break;
			}
			
		}
		return set;
	}
}
