package practice;

public class Mumble extends Baz{
      String str5;
      
      Mumble(){
    	  this.str5="Moon";
      }
      Mumble(String s){
    	  this.str5=s;
      }
      
      public void sets(String s) {
    	  str5=s;
      }
      public String gets() {
    	  return str5;
      }
      
      @Override
      public void m2() {
    	  str5="sky";
    	  System.out.println("sky");
      }
      
      @Override
      public String toString() {
    	  return "R> "+str5;
      }
}
