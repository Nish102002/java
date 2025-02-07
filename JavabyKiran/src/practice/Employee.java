package practice;
import java.util.Scanner;

import array.Employe;
public class Employee extends Person{
	Scanner sc=new Scanner(System.in);
	
	private String post;
	private  int salary;
	private static Employee[] Employee=new Employee[5];
	private static int count=0;
	
	public Employee(){
		this.acceptdata(); 
		addtoarray();
	}
	public Employee(String post,int salary) {
		super();
		setpost(post);
		setsalary(salary);
		addtoarray();
	}
	
	public Employee(String name,int age,String post, int salary){
		super(name,age);
		setpost(post);
		setsalary(salary);
		addtoarray();
		
	}
	 public static void printdata() {
		 for(Employee e:Employee) {
			 e.display();
		 }
	 }
	private void addtoarray() {
		if(count>Employee.length-1)
			System.out.println("array is full");
		else {
			Employee[count++]=this;
			
		}
	}
	public void setpost(String p) {
		post=p;
	}
	public void setsalary(int s) {
		salary=s;
	}
	
	public String getpost() {
		return post;
	}
	public int getsalary() {
		return salary;
	}
	
	
	@Override
	public void acceptdata() {
		super.acceptdata(); 
		System.out.println("enter post: ");
		post=sc.next();
		System.out.println("enter salary: ");
		salary=sc.nextInt();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("post: "+getpost());
		System.out.println("salary: "+getsalary());
		System.out.println();
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"Post: "+getpost()+" "+"Salary: "+getsalary();
	}
	
	public static void sortData() {
	 	   for(int a=0; a<Employee.length; a++) {
	 		   for(int j=a+1; j<Employee.length; j++) {
	 			   if(Employee[a].salary>Employee[j].salary) {
	 				   Employee t=Employee[a];
	 				   Employee[a]=Employee[j];
	 				   Employee[j]=t;
	 			   }
	 		   } 
	 	   }
	    }

}
