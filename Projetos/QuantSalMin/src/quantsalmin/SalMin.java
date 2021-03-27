package quantsalmin;

import java.util.Scanner;

public class SalMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, salmin, quantsalmin;
		System.out.print("Informe seu salário: ");
		sal = Double.parseDouble(sc.nextLine());
		System.out.print("Informe o valor de um salário Mínimo: ");
		salmin = Double.parseDouble(sc.nextLine());
		quantsalmin = sal / salmin;
		System.out.print("Você possui " + quantsalmin + " salário(s) mínimos");
		sc.close();
	}

}
