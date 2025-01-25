package inheritance;

import java.util.Scanner;

public class Chair extends Table {
	Scanner sc=new Scanner(System.in);
    private String material;
    private int height,width,legs;
    
    public void setmaterialchair(String m1) {
    	material=m1;
    }
    public void setheightchair(int h1) {
    	height=h1;
    }
    public void setwidthchair(int w1) {
    	width=w1;
    }
    public void setlegschair(int l1) {
    	legs=l1;
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
    
    public void acceptchair () {
    	System.out.println("chair material: ");
    	setmaterialchair(sc.next());
    	System.out.println("chair height: ");
    	setheightchair(sc.nextInt());
    	System.out.println("chair width: ");
    	setwidthchair(sc.nextInt());
    	System.out.println("chair legs:");
    	setlegschair(sc.nextInt());
    }
    
    public void displaychair() {
    	System.out.println("material: "+material);
    	System.out.println("height: "+height);
    	System.out.println("width: "+width  );
    	System.out.println("legs: "+legs);
    	
    }
    Chair(){
    	
    	acceptchair();
    	displayfurniture();
    	 displaytable();
        
        displaychair();
    }
}


