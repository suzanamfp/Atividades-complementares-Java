package atividades;

import java.util.Scanner;

public class Atividade01 {
		 
	public static void main(String [] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
			
		String  valor   = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de a: ");
		valor = teclado.nextLine().trim().replace(",", ".");
		a = Double.valueOf(valor);
		System.out.println("Digite o valor de b: ");
		valor = teclado.nextLine().trim().replace(",", ".");
		b = Double.valueOf(valor);
		System.out.println("Digite o valor de c: ");
		valor = teclado.nextLine().trim().replace(",", ".");
		c = Double.valueOf(valor);
	
			
		delta = ((b*b)-(4*a*c));
		System.out.println("O valor de delta é: " + delta);
		
		if (delta < 0) {
			
			System.out.println("O valor de delta não tem solução");
		
		} else { 
			
			x1 =  ((-b + (Math.sqrt(delta))) / (2*a)); 
			System.out.println("O valor de x1 é: " + x1);
			x2 =  ((-b - (Math.sqrt(delta))) / (2*a));
			System.out.println("O valor de x2 é: "+ x2);
		
		}
		
		
	}
		
				
		
		
}
