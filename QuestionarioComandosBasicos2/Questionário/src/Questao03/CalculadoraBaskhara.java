package Questao03;

import java.util.Scanner;

public class CalculadoraBaskhara {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double delta;
		double potencia1;
		double potencia2;
		double raiz1;
		double raiz2;
		System.out.println("Bem-vindo a calculadora de baskhara eletronica:      ax²+bx+c=0 ");
		System.out.println("Por favor insira o valor de a:");
		Scanner ler = new Scanner (System.in);
		a = ler.nextInt();
		System.out.println("Por favor insira o valor de b:");
		b = ler.nextInt();
		System.out.println("Por favor insira o valor de c:");
		c = ler.nextInt();
		System.out.println("Sua equação é: " + a +"x²+" + b +"x+" + c +" = 0");
		
		

			potencia1= Math.pow(b,2);
			delta = (potencia1-(4*a*c));
		if (delta < 0) {
		System.out.println("Não é possível calcular as raizes, pois delta e menor que 0");
	} if(delta >= 0) {
		potencia2 = Math.sqrt(delta);
		raiz1= (-b + potencia2)/(2*a);
	    raiz2= (-b-potencia2)/(2*a);
	    System.out.println("e suas raizes são " + raiz1 + " e " + raiz2);
			
			}
		}


}
