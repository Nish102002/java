package homework;

public class Last_digit {
//  Write a function named "enough" that takes one integer argument, call it "goal" and returns as its
// value the smallest positive integer n for which 1+2+3+. . . +n is at least equal to goal
	
	public static void main(String[] args) {
		Last_digit l=new Last_digit();
		l.enough(22);
	}
	public void enough(int goal) {
		int sum=0;
		int count=0;
		while(sum<goal) {
			count++;
			sum+=count;
		}
		System.out.println(count);
	}

}
