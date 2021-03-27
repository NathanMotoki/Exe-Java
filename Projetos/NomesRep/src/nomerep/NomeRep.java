package nomerep;

import java.util.Scanner;

public class NomeRep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int i;
		System.out.print("Nome: ");
		nome = sc.nextLine();
		for (i=0; i<10; i++) {
			System.out.print("Nome: ");
			nome = sc.nextLine();
		}
		sc.close();
	}

}
