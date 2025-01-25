package homework;

import java.util.Scanner;

public class ArrayOdd {

	Scanner sc = new Scanner(System.in);

	public void acceptValue(int y[]) {
		int count = 0;
		while (count < y.length) {
			System.out.println("enter number:");
			int num = sc.nextInt();
			if (num % 2 != 0) {
				y[count] = num;
				count++;
			}
		}
	}

	public void DisplayValue(int y[]) {
		System.out.println("Value from array");
		for (int k = 0; k < y.length; k++) {
			System.out.println(y[k]);
		}
	}

}
