package inheritance;
import java.util.Scanner;
public class Vehicle {
	    Scanner sc=new Scanner(System.in);
           private int power, torque,energy,length;
           
           public void setpower(int p) {
        	   power=p;
           }
           public void settorque(int t) {
        	   torque=t;
           }
           public void setenergy(int e) {
        	   energy=e;
           }
           public void setlength(int l) {
        	   length=l;
           }
           
           public int getpower() {
        	   return power;
           }
           public int gettorque() {
        	   return torque;
           }
           public int getenergy() {
        	   return energy;
           }
           public int getlength() {
        	   return length;
           }
           
           
           public void acceptvehicle() {
        	   System.out.println("power: ");
        	   setpower(sc.nextInt());
        	   System.out.println("torque: ");
        	   settorque(sc.nextInt());
        	   System.out.println("energy: ");
        	   setenergy(sc.nextInt());
        	   System.out.println("length: ");
        	   setlength(sc.nextInt());
           }
           
           public void displayvehicle() {
        	   System.out.println("power:  "+power);
        	   System.out.println("torque:"+torque);
        	   System.out.println("energy:"+energy);
        	   System.out.println("length: "+length);
           }
           
           Vehicle(){
        	   acceptvehicle();
        	   displayvehicle();
        	   
        	   
        	   
           }
}
