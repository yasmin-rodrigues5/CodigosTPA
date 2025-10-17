package numeroInteiro;
import java.util.*;
public class ParOuImpar {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int numeroInt;
		System.out.println ("Adicione número inteiro aqui:");
		numeroInt= ler.nextInt();
		if(numeroInt % 2 == 0) {
			System.out.println ("Esse é um número PAR");
			}else {
				System.out.println ("Esse é um número ÍMPAR");
			}
		}
	}

