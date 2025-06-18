package aula03;

import java.util.Scanner;

public class Atv09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[5];
		double soma=0, media=0;
		
		for(int i=0; i<notas.length;i++) {
			
			System.out.printf("Informe a %d nota", i+1);
			notas[i]=sc.nextDouble();
		
		for(double nota: notas) {
			soma+=nota;
		}
		media=soma/5;
		System.out.println(media);
		}
	

	}

}
