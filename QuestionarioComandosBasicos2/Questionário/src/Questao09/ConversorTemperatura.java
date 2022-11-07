package Questao09;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main (String [] args) {
		float TemperaturaCelsius;
		float TemperaturaFahrenheit;
		int escolha;
		
		System.out.println("Bem - vindo ao conversor de temperatura eletronico\n"
				+ "Escolha que tipo de temperatura voce quer converter:\n"
				+ "1 -  Graus Celsius para fahrenheit\n"
				+ "2 - Graus fahrenheit para Celsius");
		Scanner ler = new Scanner (System.in);
		escolha = ler.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Por favor insira a temperatura em graus celsius:");
			TemperaturaCelsius = ler.nextInt();
			TemperaturaFahrenheit = ((TemperaturaCelsius*9/5)+32);
			System.out.println(TemperaturaCelsius + " graus Celsius correspondem a " + TemperaturaFahrenheit + " graus Fahrenheit");
			break;
		case 2:
			System.out.println("Por favor insira a temperatura em graus Fahrenheit:");
			TemperaturaFahrenheit = ler.nextInt();
			TemperaturaCelsius= (TemperaturaFahrenheit-32)*5/9;
			System.out.println(TemperaturaFahrenheit + " graus Fahrenheit correspondem a " + TemperaturaCelsius + " graus Celsius");
			
		}
	}

}
