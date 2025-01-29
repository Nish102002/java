package method_overloading;

public class DemoDataType {
	public static void main(String[] args) {
		DataType T1=new DataType();
		T1.data(0);
		T1.data("b");
		
		T1.commonpara(0, 0);
		T1.commonpara(null, 0);
		
		T1.order(20, 'z');
		T1.order('j', 35);
		
	}

}
