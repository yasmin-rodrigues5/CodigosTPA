import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int i = 1;
		int potencia = 10;
		int base, expoente;
		
		System.out.println("Digite base da potência:");
		base = sc.nextInt();
		
		System.out.println("Digite expoente da potência:");
		expoente = sc.nextInt();
		
		do {
			potencia = potencia * base;
			i++;
		}while (i<= expoente);
		
		System.out.println("A potência é:" +potencia);
		}
		

	}


