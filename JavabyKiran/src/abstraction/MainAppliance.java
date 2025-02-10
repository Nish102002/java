package abstraction;

public class MainAppliance {
	public static void main(String[] args) {
		
		Appliance A=new WashingMachince();
		A.trunOn();
		
		Appliance a1=new Refrigerator();
		a1.trunOn();
	}

}
