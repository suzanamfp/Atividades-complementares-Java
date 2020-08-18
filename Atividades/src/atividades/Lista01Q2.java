package atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista01Q2 {
	
	public static float calretangulo(float base, float altura) {
		return base*altura;
	}
		
	
	public static void main(String[] args) {
		
		float base, altura;
		
		// 1- Forma de fazer:
		
		//Scanner teclado = new Scanner(System.in);
		//System.out.println("Digite a medida da base: ");
		//base = Float.valueOf(teclado.nextLine());
		//System.out.println("Digite a medida da altura: ");
		//altura = Float.valueOf(teclado.nextLine());
		//System.out.println("O valor da área do retângulo é: " + calretangulo(base,altura) + " m²"); 
		
		// 2 - Forma de fazer:
		
		base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base: "));
		altura =Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
		JOptionPane.showMessageDialog(null, "O valor da área do retângulo é: " + (base*altura) + " m²");
		
		
		
		
		
		
	}

}
