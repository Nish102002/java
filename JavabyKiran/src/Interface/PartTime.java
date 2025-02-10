package Interface;

public class PartTime implements Empolye {
        private int id,hours_worked;
        private String name;
        private double hour_rate;
        
        PartTime(int id,int hours_worked,double hour_rate,String name){
      	  this.hour_rate=hour_rate;
      	  this.hours_worked=hours_worked;
      	  this.id=id;
      	  this.name=name;
        }
        @Override
     public double calSalary() {
        	double salary;
        	return salary=hours_worked*hour_rate;
        	
        
        }
        
        @Override
        public String getDetails() {
      	  return "hours_workde"+hours_worked+" id"+id+"hour_rate"+hour_rate+" name"+name+"salary"+calSalary();
        }
        
}
