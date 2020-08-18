package atividades;

import java.util.Scanner;

public class Lista01Q4 {

	public static void main(String[] args) {
		
		float numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = Float.valueOf(teclado.nextLine());
		
		if (numero >= 0) {
		System.out.println("Este número é positivo!");
		}
		
		else {
		System.out.println("Este número é negativo!");
		}
		
		
	}	
	
}

