package sucessorAntecessor;

import java.util.Scanner;

public class SucessorAntecessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, suc, ant;
		System.out.print("Informe um número: ");
		num = Double.parseDouble(sc.nextLine());
		suc = num+1;
		ant = num-1;
		System.out.print(ant + "," + num + "," + suc);
		sc.close();
	}

}