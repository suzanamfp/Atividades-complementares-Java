package atividades;

import java.util.Scanner;

public class Lista01Q3{
	

	public static void main(String[] args) {
		
		float numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero valido: ");
		numero = Float.valueOf(teclado.nextLine());
		
		if (numero>10) {
		System.out.println("� MAIOR QUE 10");
		}
		else {
		System.out.println("N�O � MAIOR QUE 10");
		}	
	}
}