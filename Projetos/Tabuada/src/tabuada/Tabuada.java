package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, res, i;
		System.out.print("Insira um numero: ");
		num = sc.nextInt();
		for (i=0; i<10; i++) {
			res = i * num;
			System.out.println(num + " X " + i + " = " + res);
		}
		sc.close();
	}

}
