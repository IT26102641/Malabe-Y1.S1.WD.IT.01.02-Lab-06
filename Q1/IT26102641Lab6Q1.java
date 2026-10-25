import java.util.Scanner;

public class IT26102641Lab6Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number: ");
		double number = sc.nextDouble();
		
		double square = number * number;
		double sqrt = Math.sqrt(number);
		
		System.out.println(" \nThe square of " + number + " is : " + square);
		System.out.println(" The square root of " + number + " is : " + sqrt);
		
		sc.close();
	}
}