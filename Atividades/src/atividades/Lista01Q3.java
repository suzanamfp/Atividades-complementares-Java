package atividades;

import java.util.Scanner;

public class Lista01Q3{
	

	public static void main(String[] args) {
		
		float numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número valido: ");
		numero = Float.valueOf(teclado.nextLine());
		
		if (numero>10) {
		System.out.println("É MAIOR QUE 10");
		}
		else {
		System.out.println("NÃO É MAIOR QUE 10");
		}	
	}
}