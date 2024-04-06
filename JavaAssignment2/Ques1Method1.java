//1.Find the Fibonacci Series up to Nth Term in Java Language
//Method 1: Using Iteration (Using Three variables)
package JavaAssignment2;

import java.util.Scanner;

public class Ques1Method1 {

	public static void main(String[] args) {

		// 1st Method
		Scanner sc = new Scanner(System.in);
		int first = 0, second = 1, third = 1;
		int n;
		System.out.println("Enter nth term: ");
		n = sc.nextInt();
		System.out.print(first + " " + second);
		for (int i = 2; i < n; i++) {
			third = first + second;
			System.out.print(" " + third);
			first = second;
			second = third;
		}
	}

}
