package altsex;

import java.util.Scanner;

public class AlturaSexo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sex, qtdMulheres=0, qtdHomens=0, i;
		float alt, somaH=0, mediaHomens=0, maior=0, menor=0;
		for (i=0; i<10; i++) {
			System.out.print("Sexo: (digite-1:Homem digite-2:Mulher)");
			sex = sc.nextInt();
			System.out.print("Altura: ");
			alt = sc.nextFloat();
			if (sex == 1) {
				qtdMulheres++;
			} else if(sex == 2) {
				qtdHomens++;
				somaH = somaH + alt;
			} else {
				System.out.println("Sexo Inválido!!");
			} if (alt > maior) {
				maior = alt;
			} else if (alt < menor) {
				menor = alt;
			}
		}
		
		mediaHomens = somaH / qtdHomens;
		
		System.out.println("Maior Altura: " + maior);
		System.out.println("Menor Altura: " + menor);
		System.out.println("Media Altura Homens: " + mediaHomens);
		System.out.println("Quantidade Mulheres: " + qtdMulheres);
		
		sc.close();
	}

}
