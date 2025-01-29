package method_overloading;

public class Demoacess {
  public static void main(String[] args) {
	Access A1=new Access();
	A1.modifer(0, null);
	A1.modifier(null, 0);
	
	A1.ret(0, 0);
	A1.ret(0);
	
	A1.data(0);
	A1.data(null, 0);
	
	A1.para(0);
	A1.para(null, 0);
}
}
