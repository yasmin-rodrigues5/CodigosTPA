package numeroInteiro;
import java.util.*;
public class Idade {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int anoNasc, anoAtual, idade;
		System.out.println ("Digite o ano de nascimento aqui:");
		anoNasc= ler.nextInt();
		System.out.println ("Digite o ano atual aqui:");
		anoAtual= ler.nextInt();
		idade= anoAtual-anoNasc;
		System.out.println ("A idade é de:" +idade);
		if(idade>18) {
			System.out.println ("MAIOR DE IDADE!");
			}else {
				System.out.println ("MENOR DE IDADE!");
			}
		}
	}

