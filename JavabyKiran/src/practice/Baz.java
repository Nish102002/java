package practice;

public class Baz extends Foo{
	String str3;
	
	Baz(){
		this.str3="jupiter";
	}
	Baz(String str){
		this.str3=str;
	}
	
	public void setstr(String str) {
		str3=str;
	}
	public String getstr() {
		return str3;
	}
	@Override
	void m1() {
		str3="water";
		System.out.println("water");
	}
	
	@Override
	public String toString() {
		return "D> "+str3;
	}
	

}
