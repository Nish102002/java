package series;

public class S11 {
	public static void main(String[] args) {
		int pro=1;
		for(int i=11; i<=22; i++) {
			if(i%2==0) {
		pro*=i;
		}
		}
		System.out.println(pro);
	}

}
