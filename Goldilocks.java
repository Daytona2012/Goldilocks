import java.util.Scanner;

public class Goldilocks {

	public static void main(String[] args) {
		float temperature;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature of porridge: ");
		temperature = in.nextFloat();
		
		if(temperature >= 200.0) {
			System.out.println("This porridge is too hot!");
		} else if (temperature <= 69.0) {
			System.out.println("THis porridge is too cold!");
		} else {
			System.out.println("This porridge is just right...");
		}

	}

}
