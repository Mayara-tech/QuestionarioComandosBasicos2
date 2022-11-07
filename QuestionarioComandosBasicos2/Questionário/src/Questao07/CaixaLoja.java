package Questao07;

import java.util.Scanner;

public class CaixaLoja {
	public static void main (String[] args) {
		String Produto;
		int quantidade;
		float preço;
		float desconto = 0;
		float total;
		float totalComDesconto;
		
		System.out.println("------------------------ Bem-vindo a Java Store -------------------------\n"
				+ "Digite o nome do Produto:");
		Scanner ler = new Scanner (System.in);
		Produto = ler.nextLine();
		System.out.println("Digite o preço unitário do produto:");
		preço = ler.nextFloat();
		System.out.println("Digite a quantidade de produtos adquirida:");
		quantidade = ler.nextInt();
		
		total=(preço*quantidade);
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
		System.out.println("-------------------------------------- DESCRIÇÃO DA COMPRA ---------------------------------------\n\n PRODUTO                       QUANTIDADE                PREÇO unit              DESCONTO              TOTAL\n" + Produto + "                      " + quantidade + "                         " + preço + "                       "+ desconto + "                    " + totalComDesconto);
		
		
	}

}
