package atividades;

import java.util.Scanner;

public class Lista01Q7Q9 {
	
	public static float divisao(int numero1, int numero2) {
		 return (numero1 / numero2);	
		
	}

	public static void main(String[] args) {
		
		int   numero1   = 0;
		int   numero2   = 0;
		float resultado = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		numero1 = Integer.valueOf(teclado.nextLine());
		
		for (int i=1; i<2;) {
			System.out.print("Digite outro n�mero: ");
			numero2 = Integer.valueOf(teclado.nextLine());
			if(numero2 != 0) {
				break;
			} else {
				System.out.println("N�MERO INV�LIDO! ");//Implementa��o da quest�o 9.
	
			}
		}
		
		resultado = divisao(numero1, numero2);
		System.out.println("A divis�o corresponde a: " + resultado); 
		teclado.close();
	}

}
