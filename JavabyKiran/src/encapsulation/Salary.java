package encapsulation;

import java.util.Scanner;

public class Salary {
	Scanner sc = new Scanner(System.in);
	private double basic_salary,pf,pt,hra,tra,da;
	private double gross_salary,net_salary;
	

	public void basic_salary() {
		System.out.println("basic_salary:");
		basic_salary=sc.nextDouble();
	}
	
	public void calpf() {
		pf=(basic_salary*12)/100;
	}
	public void calhra() {
		hra=(basic_salary*15)/100;
	}
	public void caltra() {
		tra=(basic_salary*5)/100;
	}
	public void calpt() {
		pt=(basic_salary*10)/100;
	}
	public void calda() {
		da=(basic_salary*8)/100;
	}

	public void  calgross() {
		gross_salary=basic_salary+da+hra+tra;
	}
	public void calnet() {
		net_salary=gross_salary-(pt+pf);
	}
	public void display() {
		System.out.println("basic salary:"+ basic_salary);
		System.out.println("pf:" + pf);
		System.out.println("pt:" + pt);
		System.out.println("hra:" + hra);
		System.out.println("tra:" + tra);
		System.out.println("da:" + da);
		System.out.println("gross salary:" + gross_salary);
		System.out.println("net salary:" + net_salary);
	}
}
