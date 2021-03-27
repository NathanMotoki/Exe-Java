package tempconv;

import java.util.Scanner;

public class TempConv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double K, Re, Ra, F, temp;
		System.out.print("Insira em Celsius para conversão: ");
		temp = Double.parseDouble(sc.nextLine());
		
		K = temp + 273.15;
		Re = temp * 0.8;
		Ra = temp + 1.8 + 32 + 459.67;
		F = temp * 1.8 + 32;
		
		System.out.println("Em Kelvin: " + K);
		System.out.println("Em Réaumur: " + Re);
		System.out.println("Em Rankine: " + Ra);
		System.out.println("Em Fahrenheit: " + F);
		sc.close();
	}

}
