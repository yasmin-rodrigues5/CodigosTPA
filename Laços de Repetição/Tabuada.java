package prjLacoTpa;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro para a tabuada desejada");
		int numero =sc.nextInt();
		
		int i = 1;
		while (i <= 10) {
			System.out.println(numero + "x" + i + "=" + (numero * i));
			i++;
			
		}
	}

}
