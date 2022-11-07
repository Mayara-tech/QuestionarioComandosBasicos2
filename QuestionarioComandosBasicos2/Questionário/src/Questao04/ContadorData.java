package Questao04;

import java.util.Scanner;

public class ContadorData {
	public static void main(String[] args) {
		int mes1;
		int dia1;
		int ano1;
		int mes2;
		int dia2;
		int ano2;
		
		System.out.println("Bem-vindo a contador de data eletronico: ");
		System.out.println("Por favor insira o dia da primeira data:");
		Scanner ler = new Scanner (System.in);
		dia1 = ler.nextInt();
		System.out.println("Por favor insira o mes da primeira data:");
		mes1 = ler.nextInt();
		System.out.println("Por favor insira o ano da primeira data:");
		ano1 = ler.nextInt();
		System.out.println("Por favor insira o dia da segunda data:");
		dia2 = ler.nextInt();
		System.out.println("Por favor insira o mes da segunda data:");
		mes2 = ler.nextInt();
		System.out.println("Por favor insira o ano da segunda data:");
		ano2 = ler.nextInt();
		
		if (mes1<12) {
		switch (mes1) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (mes1>30) {
				System.out.println("primeira data invalida");
			}break;
		case 4: case 6: case 9: case 11:
			if(mes1>31) {
				System.out.println(" primeira data invalida");
			}break;
		case 02:
			if(mes1>29) {
				System.out.println("primeira data invalida");
			}break;
		}
		} else 
			System.out.println("primeira data invalida");
	if (mes2<12) {
	switch (mes2) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		if (mes2>30) {
			System.out.println("segunda data invalida");
		}break;
	case 4: case 6: case 9: case 11:
		if(mes2>31) {
			System.out.println(" segunda data invalida");
		}break;
	case 02:
		if(mes2>29) {
			System.out.println("segunda data invalida");
		}break;
	}
	} else 
		System.out.println("segunda data invalida");
		
	if(ano1>ano2) {
		System.out.println("A maior data é: " + dia1 +"/"+ mes1 +"/"+ ano1);
	}
	if(ano2>ano1) {
			System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		}
	if (ano1==ano2) {
		if(mes1>mes2) {
			System.out.println("A maior data é: " + dia1 +"/"+ mes1 +"/"+ ano1);
		}
		if(mes2>mes1) {
				System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
	} if(mes1==mes2) {
		if(dia1>dia2) {
			System.out.println("A maior data é: " + dia1 +"/"+ mes1 +"/"+ ano1);
		}
		if(dia2>dia1) {
				System.out.println("A maior data é: " + dia2 + "/" + mes2 + "/" + ano2);
		}
		if(dia1==dia2) {
			System.out.println("As datas são iguais");
		}
	}

	}	
}
}
