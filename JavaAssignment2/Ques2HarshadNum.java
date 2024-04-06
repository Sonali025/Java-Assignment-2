package JavaAssignment2;

import java.util.Scanner;

public class Ques2HarshadNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, temp, sum = 0;
		System.out.println("Enter number: ");
		num = sc.nextInt();
		temp = num;
		while (temp > 0) {
			sum = sum + temp % 10;
			temp /= 10;
		}
		if (num % sum == 0) {
			System.out.println(+num + " is a Harshad number");

		} else {
			System.out.println(+num + " is not Harshad number");
		}

	}

}
