package Questao02;

import java.util.Scanner;

public class IdentificadorCaractere {
	public static void main(String[] args) {
		String entrada;
		System.out.println("Bem-vindo ao identificador de caractere eletronico:");
		System.out.println("Por favor o caractere:");
		Scanner ler = new Scanner (System.in);
		entrada = ler.nextLine();
		switch (entrada){
		case "1":		case "2":
		case "3":		case "4":
		case "5":		case "6":
		case "7":		case "8":	
		case "9":		case "0":
			System.out.println("O caractere inserido é um número");
			break;
		case "a": case "e": case "i": case "o": case "u":case "A": case "E": case "I": case "O": case "U":
			System.out.println("O caractere inserido é uma vogal");
			break;
		case "b": case "c": case "d": case "f": case "g":case "h": case "j": case "k": case "l": case "m":
		case "n": case "p": case "q": case "r": case "s":case "t": case "v": case "w": case "x": case "y":
		case "z":
		case "B": case "C": case "D": case "F": case "G":case "H": case "J": case "K": case "L": case "M":
		case "N": case "P": case "Q": case "R": case "S":case "T": case "V": case "W": case "X": case "Y":
		case "Z":
			System.out.println("O caractere inserido é uma consoante");
			break;
		default: 
			System.out.println("O caractere inserido é uma caractere especial");
    	break;
		}
		
		
	}

}
