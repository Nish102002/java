package practice;

public class Bar extends Foo {
   String str4;
   
   Bar(){
	   this.str4="Saturn";
   }
   Bar(String str){
	   this.str4=str;
   }
   
   public void setstr(String n) {
	   str4=n;
   }
   public String getstr() {
	   return str4;
   }
   
   @Override
   public void m2() {
	   str4="air";
	   System.out.println("air");
   }
   
   @Override
   public String toString() {
	   return "w> "+str4;
   }
}
