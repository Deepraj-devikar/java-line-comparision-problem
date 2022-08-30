package com.linecomparisionproblem;

public class LineComparisionProblem {

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Problem");
		
		// Line 1
		double line1X1 = 5.8;
		double line1Y1 = 4.2;
		double line1X2 = 1.9;
		double line1Y2 = 9.7;
		double line1Length = (double) Math.sqrt(Math.pow(line1X2 - line1X1, 2) + Math.pow(line1Y2 - line1Y1, 2));
		System.out.println("First line point 1 is ("+line1X1+", "+line1Y1+"), point 2 is ("+line1X2+", "+line1Y2+") and length is "+line1Length);
		
		double line2X1 = 5.8;
		double line2Y1 = 4.2;
		double line2X2 = 1.9;
		double line2Y2 = 9.7;
		double line2Length = (double) Math.sqrt(Math.pow(line2X2 - line2X1, 2) + Math.pow(line2Y2 - line2Y1, 2));
		System.out.println("Second line point 1 is ("+line2X1+", "+line2Y1+"), point 2 is ("+line2X2+", "+line2Y2+") and length is "+line2Length);
		
		if (line1Length == line2Length) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Lines are not equal");
		}
	}

}
