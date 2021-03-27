package numeroPrimo;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, cont=0;
		System.out.print("Informe um numero: ");
		num = Integer.parseInt(sc.nextLine());
		for(i = 1; i <= num; i++) {
			if (num%i==0) {
				cont++;
			}
		}
		if (cont==2) {
			System.out.print("==== O Numero e primo ====");
		} else {
			System.out.print("==== O Numero nao e primo ====");
		}
	}

}
