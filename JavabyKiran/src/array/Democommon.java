package array;

public class Democommon {
	public static void main(String[] args) {
		int arr1[]= new int[5];
		int arr2[]=new int[7];
		Common C=new Common();
		
		C.accept(arr1, arr2);
		C.display(arr1, arr2);
		C.commonhash(arr1, arr2);
		C.display(arr1, arr2);
	}

}
