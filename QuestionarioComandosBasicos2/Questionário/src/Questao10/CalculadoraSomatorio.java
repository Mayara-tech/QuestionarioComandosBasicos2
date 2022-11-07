package Questao10;

public class CalculadoraSomatorio {
	public static void main (String[] args) {
        double n = 1;
        double j = 0;
        double soma = 0;
        
        System.out.println("-------------------------- SOMATORIO ----------------------------\n"
        		+ "1/1 + 3/2+ 5/3 ....");
        
        while (n <= 50)
        {
        	for (j =0; j<=50; j++) {
            n = j * 2 + 1;
            soma = soma + (j/n);
        }       
        }
        
                
     System.out.println("Somatorio: " + soma);
    }
}