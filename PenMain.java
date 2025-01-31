package com.collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;

class Pen
{
	private String brand;
	private String color;
	private int cost;
	private String type;
	
	public Pen(String brand, String color, int cost, String type) 
	{
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.type = type;
	}

	@Override
	public String toString() 
	{
		return "Pen [brand=" + brand + ", color=" + color + ", cost=" + cost + ", type=" + type + "]\n";
	}
	
	@Override
	public int hashCode()
	{
		return brand.hashCode() + cost + color.hashCode() + type.hashCode();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}
	
	
}

class CompareBasedOnBrand implements Comparator<Pen>
{
	@Override
	public int compare(Pen p1, Pen p2) 
	{
		return p1.getBrand().compareTo(p2.getBrand());
	}
}
class CompareBasedOnColour implements Comparator<Pen>
{
	@Override
	public int compare(Pen p1, Pen p2) 
	{
		return p1.getColor().compareTo(p2.getColor());
	}
}
class CompareBasedOnCost implements Comparator<Pen>
{
	@Override
	public int compare(Pen p1, Pen p2) 
	{
		if(p1.getCost() > p2.getCost())
			return 1;
		else if(p1.getCost() < p2.getCost())
			return -1;
		else
			return 0;
	}
}
class CompareBasedOnType implements Comparator<Pen>
{
	@Override
	public int compare(Pen p1, Pen p2) 
	{
		return p1.getType().compareTo(p2.getType());
	}
}

public class PenMain
{
	public static void main(String[] args) 
	{
		Set<Pen> set = new SetUtil<Pen>().chooseSetType();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Press 1 to Add a Pen");
			System.out.println("Press 2 to Remove a Pen");
			System.out.println("Press 3 to Display all Pens");
			int option = s.nextInt();
			if(option==1)
			{
				System.out.println("Enter Brand Of the Pen");
				String brand = s.next();
				System.out.println("Enter Colour Of the Pen");
				String colour = s.next();
				System.out.println("Enter Cost Of the Pen");
				int cost = s.nextInt();
				System.out.println("Enter Type Of the Pen");
				String type = s.next();
				set.add(new Pen(brand, colour, cost, type));
			}
			else if(option==2)
			{
				System.out.println("Enter Brand to Remove the Pen");
				String brand = s.next();
				for(Pen p : set)
				{
					set.remove(p);
				}
			}
			else if(option==3)
			{
				for(Pen p : set)
				{
					System.out.println(p);
				}
			}
			System.out.println("Do you Want to Continue,, y/n");
			char ch = s.next().charAt(0);
			if(ch=='n' || ch=='N')
				break;
		}
//		set.add(new Pen("Prime", "Blue", 15, "Ball-Point"));
//		set.add(new Pen("Cello", "Red", 10, "Ball-Point"));
//		set.add(new Pen("Reynolds", "Black", 25, "Gel-Point"));
//		set.add(new Pen("Parker", "Blue", 95, "Fountain"));
		
	}
}






















