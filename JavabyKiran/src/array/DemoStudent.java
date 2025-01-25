package array;

public class DemoStudent {
	public static void main(String[] args) {
		Student S1[]=new Student[5];
		
	
		
		Student.acceptData(S1);
		Student.DisplayData(S1);
		System.out.println();
		Student.sortData(S1);
		Student.DisplayData(S1);
	}

}
