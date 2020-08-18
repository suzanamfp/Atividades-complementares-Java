package atividades;

import java.util.Scanner;

public class LISTA01Q8Q10 {
	
	public static float divisao(int numero1, int numero2) {
		 return (numero1 / numero2);	
		
	}
	
	public static void main(String[] args) {
		
		int numero1, numero2;
		int resultado;
		
		Scanner teclado =  new Scanner(System.in);
		System.out.print("Digite um número:");
		numero1 = Integer.valueOf(teclado.nextLine());
		
		while (true) {
			System.out.print("Digite outro número: ");
			numero2 = Integer.valueOf(teclado.nextLine());
			if(numero2 != 0) {
				break;
			}else {
				System.out.println("NÚMERO INVÁLIDO! ");
			}
		}
		
		resultado = (int)divisao(numero1, numero2);
		System.out.print("A divisão corresponde a: " + resultado); //Implementação da questão 9.
		teclado.close();
	}
		

}
