package series;
import java.util.Scanner;
public class ElectricBill {
	Scanner sc=new Scanner(System.in);
	public double calculateBill() {
		double units;
		double meterCharge;
		double unitCharge;
	   double total;
		
        if (units >= 0 && units <= 100) {
            meterCharge = 150;
            unitCharge = units * 100;
        } else if (units >= 101 && units <= 200) {
            meterCharge = 200;
            unitCharge = units * 150;
        } else if (units >= 201 && units <= 300) {
            meterCharge = 250;
            unitCharge = units * 200;
        } else if (units > 300) {
            meterCharge = 300;
            unitCharge = units * 250;
        } else {
            System.out.println("Invalid input for units.");
            return 0;
        }

        return meterCharge + unitCharge;
    }
}

