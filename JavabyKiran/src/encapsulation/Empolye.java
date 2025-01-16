package encapsulation;
import java.util.Scanner;
public class Empolye {
	Scanner sc=new Scanner (System.in);
	private String name,department,education;
	private int ID,salary;
	
	public void setname(String n) {
		name=n;
	}
	public void setdepartment(String m) {
		department=m;
	}
	public void setID(int l) {
		ID=l;
	}
	public void setsalary(int k) {
		salary=k;
	}
	public void seteductaion(String j) {
		education=j;
	}
	
	public String getname() {
		return name;
	}
	public String getdepartment() {
		return department;
	}
	public int getID() {
		return ID;
	}
	public int getsalary() {
		return salary;
	}
	public String geteducation() {
		return education;
	}
	
	
	public void acceptdetail() {
		System.out.println("name :");
		setname(sc.next());
		System.out.println("department :");
		setdepartment(sc.next());
//		department=sc.next();
		System.out.println("salary :");
		setsalary(sc.nextInt());
//		salary=sc.nextInt();
		System.out.println("ID :");
		setID(sc.nextInt());
//		Id=sc.nextInt();
		System.out.println("education :");
		seteductaion(sc.next());
//		setname(sc.next());
		
		
	}
	public void display() {
		System.out.println(" name: "+  name );
		System.out.println("department: "+ department);
		System.out.println("education: "+ education );
		System.out.println("ID: "+ ID );
		System.out.println("salary: "+ salary );
		
	}
	
	
	
	
	

}
