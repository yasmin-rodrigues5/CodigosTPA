package numeroInteiro;
import java.util.Scanner;
public class programaConversao {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		double reais, convertido;
		int tipoViagem;
		System.out.println("Digite aqui a quantidade de reais:");
		reais = in.nextDouble();
		System.out.println("=== Menu de Destinos===");
		System.out.println("1-Nacional");
		System.out.println("2-Europeia");
		System.out.println("3-Norte-americana");
		System.out.println("4-Sul-americana");
		System.out.println("==========================");
		System.out.println("Digite aqui o tipo de viagem:");
		tipoViagem= in.nextInt();
		if(tipoViagem == 1) {
			System.out.println("Tipo de viagem:NACIONAL, você levará R$ " +  reais);
		}else if (tipoViagem ==2) {
			convertido = reais/6.5;
			System.out.println("Tipo de Viagem: EUROPEIA, você levará " + convertido + " Euros");
		}else if (tipoViagem ==3) {
			convertido = reais/5.2;
			System.out.println("Tipo de Viagem: NORTE-AMERICANA, você levará " + convertido + " Dolares");
		}else if (tipoViagem ==4) {
			convertido = reais/0.025;
			System.out.println("Tipo de Viagem: SUL-AMERICANA, você levará " + convertido + " Pesos Argentinos");
		}else {
			System.out.println("Tipo de Viagem: INVÁLIDA!");
			
		}
			
		}
}	

		


