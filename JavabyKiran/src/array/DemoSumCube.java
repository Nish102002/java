package array;

public class DemoSumCube {
	public static void main(String[] args) {
		SumCube S1=new SumCube();
		int y[]=new int [5];
		
     	S1.Accept(y);
		S1.Display(y);
		int sum=S1.Cube(y);
		System.out.println(sum);
	}

}
