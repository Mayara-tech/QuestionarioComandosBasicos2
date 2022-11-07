package Questao01;

import java.util.Scanner;

public class RadarVelocidade {
	public static void main(String[] args) {
		int VelocidadeVia;
		int VelocidadeVeiculo;
		int VelocidadeAcima;
		
		System.out.println("Bem-vindo a Calculadora de multas eletronica:");
		System.out.println("Por favor digite o limite máximo da via:");
		Scanner ler = new Scanner (System.in);
		VelocidadeVia = ler.nextInt();
		System.out.println("Por favor digite a Velocidade do motorista obtida pelo radar:");
		VelocidadeVeiculo = ler.nextInt();
		
		VelocidadeAcima = VelocidadeVeiculo-VelocidadeVia;
		System.out.println("O veículo estava a " + VelocidadeAcima + "km acima do limite de velocidade permitido na via");

		if (VelocidadeAcima <=10) {
			System.out.println("O motorista deve pagar R$50,00 de ato inflacionario");
		}
		if (VelocidadeAcima >= 11 ) {
			if(VelocidadeAcima <=30) {
				System.out.println("O motorista deve pagar R$100,00 de ato inflacionario");	
				}
		}
			if (VelocidadeAcima >=31) {
				System.out.println("O motorista deve pagar R$200,00 de ato inflacionario");	
			}
			
		if (VelocidadeAcima <=0){
			System.out.println("O motorista não teve penalidade.");	
		}
	}

}
