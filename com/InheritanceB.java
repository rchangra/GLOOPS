package com.inh.com;

public class InheritanceB extends InheritanceA {
	public void rectangleArea(int len, int bre) {
		int length = len;
		int breath = bre;
		float result1 = length*breath; 
		System.out.println("Rectangle area is " + result1);
	}
}
