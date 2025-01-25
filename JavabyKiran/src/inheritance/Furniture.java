package inheritance;
import java.util.Scanner;
public class Furniture {
	Scanner sc=new Scanner(System.in);
	
	private String brand,quality,warranty;
	
	public void setbrand(String b) {
		brand=b;
	}
	public void setquality(String q) {
		quality=q;
	}
	public void setwarranty(String w) {
		warranty=w;
	}
	
	public String getbrand() {
		return brand;
	}
	public String getquality() {
		return  quality;
	}
	public String getwarrantty() {
		return warranty;
	}
	
	public void acceptfurniture() {
		System.out.println("brand: ");
		setbrand(sc.next());
		System.out.println("quality: ");
		setquality(sc.next());
		System.out.println("warranty:");
		setwarranty(sc.next());
	}
	
	public void displayfurniture() {
		System.out.println("brand: "+brand);
		System.out.println("quality: "+quality);
		System.out.println("warranty: "+warranty);
		
	}
	
	Furniture(){
		acceptfurniture();
	
	}
	

}
