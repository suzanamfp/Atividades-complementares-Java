package atividades;

import java.util.Scanner;

public class Lista01Q5 {
	

	public static void main(String[] args) {
		//Maçã = produto
		
		float valor1;
		float valor2;
		int quantProduto;
		
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite a quantidade de maçãs que você quer comprar: ");
	quantProduto = Integer.valueOf(teclado.nextLine());
		
		if (quantProduto < 12) {
			valor1= (float)(quantProduto*1.3);
			System.out.println("Sua compra totalizou: " + valor1 + " reais");	
		}
		else {
			valor2 = (float)(quantProduto*1.0);
			System.out.println("Sua compra totalizou: " + valor2 + " reais");	
		}
	}
	
}	