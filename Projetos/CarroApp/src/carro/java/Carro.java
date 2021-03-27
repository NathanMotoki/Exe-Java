package carro.java;

import java.util.Scanner;

public class Carro {

	String fabricante, modelo, cor, placa; 
	double valor;
	int numerosPortas, anoFabricacao, anoModelo;

	public void setFabricante(String fab) {
		if(!fab.isEmpty()) {
			fabricante = fab;
		}
	}

	public String getFabricante() {

		return fabricante;
	}

	public void setModelo(String mod) {
		if(!mod.isEmpty()) {
			modelo = mod;
		}
	}

	public String getModelo(){

		return modelo;

	}

	public void setCor(String co) {
		if(!co.isEmpty()) {
			cor = co;
		}
	}
	public String getCor() {

		return cor;

	}

	public void setPlaca(String pla) {
		if(!pla.isEmpty()) {
			placa = pla;
		}
	}

	public String getPlaca() {

		return placa;

	}

	public void setValor(double val) {
		if(val>0) {
			valor = val;
		}
	}
	public double getValor() {

		return valor;
	}

	public void setNumerosPortas(int nump) {
		if(nump > 0) {
			numerosPortas = nump;
		}
	}

	public int getNumerosPortas() {

		return numerosPortas;
	}

	public void setAnoFabricacao(int anoF) {
		if(anoF > 0) {
			anoFabricacao = anoF;
		}
	}

	public int getAnoFabricacao() {

		return anoFabricacao;
	}

	public void setAnoModelo(int anoM) {
		if(anoM > 0) {
			anoModelo = anoM;
		}
	}

	public int getAnoModelo() {

		return anoModelo;
	}

	public void imprimir() {
		System.out.println( "Fabricante : " + getFabricante() );
		System.out.println( "Modelo : " + getModelo() );
		System.out.println( "Cor : " + getCor() );
		System.out.println( "Placa : " + getPlaca() );
		System.out.println( "Valor : " + getValor() );
		System.out.println( "Número de Portas : " + getNumerosPortas() );
		System.out.println( "Ano de fabricação: " + getAnoFabricacao() );
		System.out.println( "Ano do Modelo : " + getAnoModelo() );
	}
	public void entradaDados () {

		Scanner entrada = new Scanner( System.in );
		System.out.println("Digite o Fabricante do carro :");
		setFabricante( entrada.nextLine() );
		System.out.println("Digite o Modelo do carro :");
		setModelo( entrada.nextLine() );
		System.out.println("Digite a Cor do carro :");
		setCor( entrada.nextLine() );
		System.out.println("Digite a Placa do carro :");
		setPlaca( entrada.nextLine() );
		System.out.println("Digite o Valor do carro :");
		setValor( Double.parseDouble( entrada.nextLine()) );
		System.out.println("Digite o Número de Portas do carro :");
		setNumerosPortas( Integer.parseInt( entrada.nextLine()) );
		System.out.println("Digite o Ano de fabricação do carro :");
		setAnoFabricacao( Integer.parseInt( entrada.nextLine()) );
		System.out.println("Digite o Ano do Modelo do carro :");
		setAnoModelo( Integer.parseInt( entrada.nextLine()) );

		}
}
