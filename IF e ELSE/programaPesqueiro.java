package numeroInteiro;
import java.util.Scanner;
public class programaPesqueiro {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		double peso, preco;
		System.out.println("Digite aqui o peso em quilogramas(kg)");
		peso = in.nextDouble();
		if(peso<=3) {
			preco = peso*12;
			System.out.println("O valor a ser pago pelo pescador é de R$" + preco);
		}else if (peso<=5) {
			preco = peso*14;
			System.out.println("O valor a ser pago pelo pescador é de R$" + preco);
		}else if (peso<=10) {
			preco = peso*15;
			System.out.println("O valor a ser pago pelo pescador é de R$" + preco);
		}else if (peso>10) {
			preco = (17*peso)+8;
			System.out.println("O valor a ser pago pelo pescador é de R$" + preco);

		}
		}
}
