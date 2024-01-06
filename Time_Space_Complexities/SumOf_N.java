package Time_Space_Complexities;

import java.util.Scanner;

public class SumOf_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start = System.currentTimeMillis();
		System.out.print("Enter Number : ");
		// User Input
		long n = sc.nextInt();
		// Formula based Calculation
		long sum1 = (n * (n + 1)) / 2;
		long sum = 0;
		// loop based time Calculation it will be take more then  Formula Based
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println(sum1);
		long end = System.currentTimeMillis();
		// time calculation
		long elaspsedTime = end - start;
		System.out.println("How longer time to excute algorithm: " + elaspsedTime);
	}

}
