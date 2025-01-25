package sort;

import java.util.Scanner;

public class Bubble {
	Scanner sc = new Scanner(System.in);

	public void acceptValue(int y[]) {
		System.out.println("Enter no.:");
		for (int k = 0; k < y.length; k++) {
			y[k] = sc.nextInt();
		}
	}

	public void DisplayValue(int y[]) {
		System.out.println("Value from array");
		for (int k = 0; k < y.length; k++) {
			System.out.println(y[k]);
		}
	}

	public void sort_1(int y[]) {
		for (int k = 0; k < y.length; k++) {
			for (int j = k + 1; j < y.length; j++) {
				if (y[k] > y[j]) {
					int t = y[k];
					y[k] = y[j];
					y[j] = t;
				}
			}
		}
	}
	public void sort_2(int y[]) {
		for (int k = 0; k < y.length; k++) {
			for (int j = k + 1; j < y.length; j++) {
				if (y[k] < y[j]) {
					int t = y[k];
					y[k] = y[j];
					y[j] = t;
				}
			}
		}
	}
}
