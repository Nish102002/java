package inheritance;
import java.util.Scanner;

public class Table extends Furniture {
	Scanner sc=new Scanner(System.in);
        private String material;
        private int height,width,legs;
        
        public void setmaterial(String m) {
        	material=m;
        }
        public void setheight(int h) {
        	height=h;
        }
        public void setwidth(int w) {
        	width=w;
        }
        public void setlegs(int l) {
        	legs=l;
        }
        
        public String getmaterial() {
        	return material;
        }
        public int getheight() {
        	return height;
        }
        public int getwidth() {
        	return width;
        }
        public int getlegs() {
        	return legs;
        }
        
        public void accepttable() {
        	System.out.println("material: ");
        	setmaterial(sc.next());
        	System.out.println("height: ");
        	setheight(sc.nextInt());
        	System.out.println("width: ");
        	setwidth(sc.nextInt());
        	System.out.println("legs:");
        	setlegs(sc.nextInt());
        }
        
        public void displaytable() {
        	System.out.println("material: "+material);
        	System.out.println("height: "+height);
        	System.out.println("width: "+width  );
        	System.out.println("legs: "+legs);
        	
        }
        Table(){
        	accepttable();
        	
        }
}
