package com.bl.Linecomparison;



public class LineComparisonUC2 {
	int x1 = 20; int y1 = 10; int x2 = 32; int y2 = 30;
	public void line1() {
		double A = ((x2 - y2));
		double B = ((x1 - y1));
		int a = (int) Math.pow(A, 2);
		int b = (int) Math.pow(B, 2);
		double c = Math.addExact(a, b);
		double length1 = Math.sqrt(c);
		System.err.println("Length of 1st line :"+length1);
	}
	 
		int X1 = 20; int Y1 = 10; int X2 = 32; int Y2 = 30;
		public void line2() {
			double m = ((X2 - Y2));
			double n = ((X1 - Y1));
			int a = (int) Math.pow(m, 2);
			int b = (int) Math.pow(n, 2);
			double o = Math.addExact(a, b);
			double length2 =  Math.sqrt(o);
			System.err.println("Length of 1st line :"+length2);
		}
		public static void checkEqualsLine(double length1, double length2) {
			if(length1 == length2) {
				System.out.println("equal");
			}else {
				System.out.println("not equal");
			}
			
		}
	
	public static void main(String[] args) {
		System.out.println("Welcome to linecomparison practise problems");
		LineComparisonUC2 length1 = new LineComparisonUC2();
		length1.line1();
		LineComparisonUC2 length2 = new LineComparisonUC2();
		length2.line2();
		checkEqualsLine(0, 0);
	
		
	}
		
	}
	


