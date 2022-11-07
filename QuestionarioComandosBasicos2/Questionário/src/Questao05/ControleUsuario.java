package Questao05;

import java.util.Scanner;

public class ControleUsuario {
	public static void main (String[] args) {
		int usuarioAcesso =1234;
		int senhaAcesso=9999;
		int usuario;
		int senha;
		
		System.out.println("Bem-vindo ao controle de segurança. Por favor digite o usuario:");
		Scanner ler =  new Scanner (System.in);
		usuario = ler.nextInt();
		if(usuario == usuarioAcesso) {
			System.out.println("Por favor digite a senha:");
			senha= ler.nextInt();
			if (senha==senhaAcesso) {
				System.out.println("Acesso Permitido");
			} else
				System.out.println("senha invalida");	
			}else
				System.out.println("Usuario invalido");
		
		
		 
		
		
	}

}
