package series;

public class CountEven {
	public static void main(String[] args) {
		int count=0;
		for(int i=111;i<=212;i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
