package Questao07;

import java.util.Scanner;

public class CaixaLoja {
	public static void main (String[] args) {
		String Produto;
		int quantidade;
		float pre�o;
		float desconto = 0;
		float total;
		float totalComDesconto;
		
		System.out.println("------------------------ Bem-vindo a Java Store -------------------------\n"
				+ "Digite o nome do Produto:");
		Scanner ler = new Scanner (System.in);
		Produto = ler.nextLine();
		System.out.println("Digite o pre�o unit�rio do produto:");
		pre�o = ler.nextFloat();
		System.out.println("Digite a quantidade de produtos adquirida:");
		quantidade = ler.nextInt();
		
		total=(pre�o*quantidade);
		if (quantidade <= 5) {
			desconto = ((2*total)/100);
		}
		if (quantidade > 5 && quantidade <=10 ) {
			desconto = ((3*total)/100);
		}
		if (quantidade >10) {
			desconto = ((5*total)/100);
			
		}
		totalComDesconto = total-desconto;
		System.out.println("-------------------------------------- DESCRI��O DA COMPRA ---------------------------------------\n\n PRODUTO                       QUANTIDADE                PRE�O unit              DESCONTO              TOTAL\n" + Produto + "                      " + quantidade + "                         " + pre�o + "                       "+ desconto + "                    " + totalComDesconto);
		
		
	}

}
