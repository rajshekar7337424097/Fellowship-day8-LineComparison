package com.bl.Linecomparison;

public class LineComparisonUC1 {
	
	public void lenthOfTwoPoints(int x1, int y1, int x2, int y2) {
		double A = ((x2 - y2));
		double B = ((x1 - y1));
		int a = (int) Math.pow(A, 2);
		int b = (int) Math.pow(B, 2);
		double c = Math.addExact(a, b);
		double length = Math.sqrt(c);
		System.err.println("Length of 1st line :"+length);
	}
	public static void main(String[] args) {
		LineComparisonUC1 length1 = new LineComparisonUC1();
		length1.lenthOfTwoPoints(20, 10, 25, 40);
	}
	

}
