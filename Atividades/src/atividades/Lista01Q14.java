package atividades;

import javax.swing.JOptionPane;

public class Lista01Q14 {
	
	public static void main(String[] args) {
		
		int numero=0;
		int soma=0;
		
		for (int i=0; i<=8; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				soma = soma + numero;
				JOptionPane.showInputDialog(null,"A soma dos números corresponde a: "+ soma);
					
					
		}
			
		
		}
	}


