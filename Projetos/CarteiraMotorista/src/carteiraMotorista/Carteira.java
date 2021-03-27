package carteiraMotorista;

import java.util.Scanner;

public class Carteira {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
		System.out.print("Quantos anos voce tem?");
		ano = sc.nextInt();
		if (ano >= 18) {
			System.out.print("Idade suficiente para dirigir e votar");
		} else if (ano <= 17) {
			System.out.print("Idade insuficiente");
		} else {
			System.out.print("Idade invalida");
		}
	}

}
