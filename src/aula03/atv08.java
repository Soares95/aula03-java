package aula03;

import java.util.Scanner;

public class atv08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[4];
		int d[] = new int[4];
		Scanner sc = new Scanner(System.in);
		int tamanho=a.length;
		for (int x=0; x<tamanho; x++) {
			System.out.println("Digite o primeiro valor de A ");
			a[x]=sc.nextInt();
			System.out.println("Digite o primeiro valor de B ");
			b[x]=sc.nextInt();
			System.out.println("Digite o primeiro valor de C ");
			c[x]=sc.nextInt();
			System.out.println("Digite o primeiro valor de D ");
			d[x]=sc.nextInt();
		}
		sc.close();
	}

}
