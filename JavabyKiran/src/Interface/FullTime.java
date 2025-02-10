package Interface;

public class FullTime implements Empolye{
      private double salary;
      private int id;
      private String company,name;
      
      FullTime(double salary,int id,String company,String name){
    	  this.company=company;
    	  this.id=id;
    	  this.name=name;
    	  this.salary=salary;
      }
      public double calSalary() {
    	  return salary;
      }
      public String getDetails() {
    	  return "salary"+salary+" id"+id+"company"+this.company+" name"+name;
      }
}
