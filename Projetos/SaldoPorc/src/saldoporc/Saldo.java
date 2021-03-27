package saldoporc;

import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, rem, total;
		System.out.print("Insira o seu salário atual: ");
		sal = Double.parseDouble(sc.nextLine());
		rem = sal * 1/100;
		total = rem + sal;
		System.out.print("Seu salário remanejado fica: " + total);
		sc.close();
	}

}
