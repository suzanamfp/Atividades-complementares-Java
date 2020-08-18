package atividades;

import java.util.Scanner;

public class Lista01Q11 {

	public static float media(float nota1, float nota2) {
		return (nota1 + nota2)/2;  
	}

	public static void main(String[] args) {

		float nota1 = -1;
		float nota2 = -1 ; 

		float mediaS = 0;


		Scanner teclado = new Scanner(System.in);
		//	System.out.print("Digite a primeira nota: ");
		//	nota1 = Float.valueOf(teclado.nextLine());
		//	System.out.print("Digite a segunda nota: ");
		//	nota2 = Float.valueOf(teclado.nextLine());


		while (true) {
			if (nota1<0 || nota1>10 ) {
				System.out.print("Digite a primeira nota: ");
				nota1 = Float.valueOf(teclado.nextLine());
				if (nota1<0 || nota1>10 ) {
					System.out.print("Nota Inválida!");
					continue;
				}
			}

			if (nota2<0 || nota2>10 ) {
				System.out.print("Digite a segunda nota: ");
				nota2 = Float.valueOf(teclado.nextLine());
				if (nota2<0 || nota2>10 ) {
					System.out.print("Nota Inválida!");
					continue;
				}else {
					break;
				}
			}

		}

		mediaS = media(nota1,nota2);
		System.out.print("A média corresponde a: " + mediaS);
		teclado.close();

	}
}	





