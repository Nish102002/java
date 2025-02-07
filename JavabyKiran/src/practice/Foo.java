package practice;

public class Foo {
	String str1,str2;
	
	Foo(){
		this.str1="Earth";
		this.str2="Sun";
	}
	Foo(String str1,String str2){
		this.str1=str1;
		this.str2=str2;
	}
	
	void m1() {
		str1="Good";
		System.out.println("Good");
	}
	void m2() {
		str2="nice";
		System.out.println("nice");
	}
	
	public void setstr1(String s) {
		str1=s;
	}
	public void setstr2(String s1) {
		str2=s1;
	}
	
	public String getstr1() {
		return str1;
	}
	public String getstr2() {
		return str2;
	}
	

	public String toString() {
		return "S1> "+str1+"S2> "+str2;
	}

}
