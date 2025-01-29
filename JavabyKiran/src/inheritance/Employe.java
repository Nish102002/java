package inheritance;
import java .util.Scanner;
public class Employe extends Person {
	
	Scanner sc=new Scanner(System.in);
	
	private double salary,pf,pt,hra,tra,da;
	private double gross_salary,net_salary;

    public void salary() {
    	System.out.println("salary: ");
    	salary=sc.nextDouble();
    }
    public void calpf() {
    	pf=(salary%12)/100;
    }
    public void calpt() {
    	pt=(salary%10)/100;
    }
    public void calhra() {
    	hra=(salary%15)/100;
    }
    public void caltra() {
    	tra=(salary%5)/100;
    }
    public void calda() {
    	da=(salary%8)/100;
    }
    public void  calgross() {
		gross_salary=salary+da+hra+tra;
	}
	public void calnet() {
		net_salary=gross_salary-(pt+pf);
	}
    
    public void display() {
    	System.out.println("salary: "+salary);
    	System.out.println("pf: "+pf);
    	System.out.println("pt: "+pt);
    	System.out.println("hra: "+hra);
    	System.out.println("tra: "+tra);
    	System.out.println("da: "+da);
    	System.out.println("gross salary: "+gross_salary);
    	System.out.println("net salary: "+net_salary);
    }
    

}
