package aula03;

import java.util.Scanner;

public class atv06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new scanner(System.in);
		System.out.println("qtd de alunos: ");
		int qtd = sc.nextInt();
		double soma=0;
		
		for (int x=0; x<qtd ;x++) {
			System.out.println("Informe a nota: ");
			soma+=sc.nextDouble();
			
		double  media = soma/qtd;
		System.out.println(media);
		}

	}

}
