// code by Natalie Borgorez

package ch01;

import  java.util.Scanner;
class  LeapYear {
    public static  boolean isLeapYear(int year) {
	 return  (year%4==0 && year%100!=0)||(year%100==0 && year%400==0) ;
    }
}
public class TestLeapYear{
	public static void main(String args[]) {
		System.out.println("Enter a year: ");
		Scanner  sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ( LeapYear.isLeapYear(year)){
		    System.out.println(year+" is a leap year");
		}
		else{
		      System.out.println(year+" is not a leap year");
		}
		sc.close();
	}
}

// code by Natalie Borgorez
