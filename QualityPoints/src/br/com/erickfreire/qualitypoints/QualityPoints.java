package br.com.erickfreire.qualitypoints;

import java.util.Scanner;

/**
 * Programa em Java que informa a qualidade de nota de um aluno
 * @author Erick Freire
 * @version 1 - Criado em 06-05-2021
 */

public class QualityPoints {

	public static void main(String[] args) {
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que informa a qualidade da média de um aluno: ");
		
		System.out.print("Informe a média da nota de um aluno: ");
		media = entrada.nextDouble();
		
		qualidadeDePontuacao(media);

	}
	
	public static void qualidadeDePontuacao(double m) {
		
		if(m >= 90) {
			System.out.println("Nota 4");
		}
		
		if(m >= 80 && m < 90) {
			System.out.println("Nota 3");
		}
		
		if(m >= 70 && m < 80) {
			System.out.println("Nota 2");
		}
		
		if(m >= 60 && m < 70) {
			System.out.println("Nota 1");
		}
		
		if(m < 60) {
			System.out.println("Nota 0");
		}
		
	}

}
