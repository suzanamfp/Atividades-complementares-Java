package atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista01Q1 {
	
	public static void main(String[] args) {
		
		int idade;
		
		idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade: "));
		JOptionPane.showMessageDialog(null,"Você tem: " + (idade * 365) + " dias");
		
		//Outra forma de fazer:
		
		//Scanner teclado = new Scanner(System.in);
		//System.out.println("Digite sua idade: ");
		//idade = Integer.valueOf(teclado.nextLine());

		//System.out.println("Pela quantidade de anos, você tem: "+ dias + " dias");
		
		
	}

}
