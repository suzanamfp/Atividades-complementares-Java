package atividades;

import java.util.Scanner;

public class Atividade02 {

		public static void main(String [] args) {
			
			float valorHora;
			float quantHora;
			float salarioBruto;
			float custoIPRF;
			float custoINSS;
			float custoSindicato;
			float salarioLiq;
			float custoDescontos;
			
			
			String valores = "";
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o valor da hora:");
			valorHora = Float.valueOf(teclado.nextLine());
			System.out.println("Digite a quantidade de horas trabalhada:");
			quantHora = Float.valueOf(teclado.nextLine());
			
			
			salarioBruto = (valorHora * quantHora);
			System.out.println("O valor do salario bruto é: " + salarioBruto);
			
			custoIPRF =	 (float) (valorHora * quantHora * 0.11);
			System.out.println("O valor do custo IPRF é:"+ custoIPRF);
			
			custoINSS = (float) (valorHora * quantHora * 0.08);
			System.out.println("O valor do custo INSS é:"+ custoIPRF);
			
			custoSindicato = (float) (valorHora * quantHora * 0.05);
			System.out.println ("O valor do custo ao sindicato é :" +custoSindicato);
			
			salarioLiq = salarioBruto - (custoIPRF + custoINSS + custoSindicato);
			System.out.println ("O valor do salário Liquido é :" + salarioLiq);
			
			custoDescontos = (custoIPRF + custoINSS + custoSindicato);
			System.out.println("O valor dos descontos é :" +custoDescontos);
			
			
				
		}
		














}
