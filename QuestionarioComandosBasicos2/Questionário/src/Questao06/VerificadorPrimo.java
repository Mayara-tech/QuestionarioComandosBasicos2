package Questao06;

import java.util.Scanner;

public class VerificadorPrimo {
	public static void main (String[] args) {
		int numero;
		int j;
		boolean resposta = true;
		System.out.println("Bem-vindo ao verificador de numero primo. Por Favor insira o numero a ser verificado: ");
		Scanner ler =  new Scanner (System.in);
		numero = ler.nextInt();
		
		for (j=2; j<numero; j++) {
			if (numero % j == 0) {
				resposta=false;
			}
		}
		if(resposta==false) {
			System.out.println("O numero não é primo");
		} else
			System.out.println("O numero é primo");
	}
}
