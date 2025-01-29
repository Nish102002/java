package method_overloading;

import javax.print.attribute.IntegerSyntax;

public class Varags {
	   public void logic(String... n) {
		   for(String i:n) {
			   System.out.println(i+" ");
		   }
		   
	   }
	   public void logic(int... g) {
		   for(int i:g) {
			   System.out.println(g);
		   }
	   }
	   public void vara(String... b) {
		   for(String i:b) {
			   System.out.println(i+" ");
		   }
	   }
        public void vara(int n; String... c) {
        	for(String i:c) {
        		System.out.println(i+n+" ");
        	}
        }



