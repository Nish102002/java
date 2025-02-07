package array;
import java.util.Scanner;
import java.util.HashSet;
public class Common {
	Scanner sc=new Scanner(System.in);
	public void accept(int arr1[], int arr2[]) {
	
	System.out.println("enter array 1: ");
	for(int i=0; i<arr1.length; i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println();
	System.out.println("enter array 2: ");
	for(int j=0; j<arr2.length; j++) {
		arr2[j]=sc.nextInt();
	}
	}
	
	public void display(int arr1[], int arr2[]) {
		System.out.println(" array 1: ");
		for(int i=0; i<arr1.length; i++) {
        System.out.println(arr1[i]);
}
		System.out.println();
		System.out.println("array 2: ");
		for(int  j=0; j<arr2.length; j++) {
			System.out.println(arr2[j]);
		}
	}
	
//		for(int i=0; i<arr1.length; i++) {
//			for(int j=0; j<arr2.length; j++) {
//				if(arr1[i]!=arr2[j]) {
//					System.out.println(arr1[i]);
//				}
//			}
//		}
//	}
	public void commonhash(int arr1[],int arr2[]) {
		HashSet<Integer> h=new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			for(int j=0;  j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					h.add(arr1[i]);
					break;
				}
			}
		}
		System.out.println(h);
	}
}