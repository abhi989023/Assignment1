package day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		System.out.print("Enter The Year:");
		int year= input.nextInt();
		
		if(year<1582)
		{
			System.out.println("Please Enter year above 1582");
		}
		if( year%400 == 0)
		{
			System.out.println("Leap Year");
		}
		else if (year%4 == 0 && year%100!=0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
 