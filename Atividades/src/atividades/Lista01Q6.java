package atividades;

import java.util.Scanner;

public class Lista01Q6 {
	
	public static float mediaPonderada(float nota1, float nota2, float nota3) {
		return (float)((nota1*4)+(nota2*3)+(nota3*3))/10;
	}

	public static void main(String[] args) {
		
		String nome;
		float nota1, nota2, nota3;
		float mediaP;
		float maiorNota;
		float soma;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a segunda nota: ");
		nota2 = Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a terceira nota: ");
		nota3 = Float.parseFloat(teclado.nextLine());
		
		mediaP = mediaPonderada(nota1, nota2, nota3);
		System.out.print("A media ponderada é: " +  mediaP);
		
		if (nota1 > nota2 && nota1>nota3) {
			maiorNota = nota1;
			soma = nota2 + nota3;
		}	
		else if (nota2> nota1 && nota2>nota3) {
			maiorNota = nota2;
			soma = nota1+nota3;
		}
			
		else if (nota3>nota2 && nota3>nota1 ){
			maiorNota = nota3;
			soma = nota2+nota3; 	
		}
		
		if (mediaP>5) {
			System.out.println("APROVADO!");	
		}
		
		else {
			System.out.println("REPROVADO!");	
		}
		
		
	}
		
}

