package carro.java;

import java.util.Scanner;

public class AppCarro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Carro car1 = new Carro();
		car1.entradaDados();
		car1.imprimir();
		Carro car2 = new Carro();
		car2.entradaDados();
		car2.imprimir();
		Carro car3 = new Carro();
		car3.entradaDados();
		car3.imprimir();
	}
}
