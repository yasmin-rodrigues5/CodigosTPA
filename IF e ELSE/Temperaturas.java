package numeroInteiro;
import java.util.*;
public class Temperaturas {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double tFahrenheit, celsius;
		System.out.println("Adicione aqui a temperatura em Fahreinheit:");
		tFahrenheit = ler.nextInt();
		celsius = (tFahrenheit - 32) * 5 / 9;
		System.out.println ("A temperatura convertida em Celsius � de:" +celsius);
		if(celsius <0) {
			System.out.println ("Est� FRIO EXTREMO!");
		}else if (celsius <= 10) {
			System.out.println ("Est� FRIO!");
		}else if (celsius <= 20) { 
			System.out.println ("Est� FRIO MODERADO!");
		}else if (celsius <= 24) {
			System.out.println ("Est� um CLIMA AMENO!");
		} else {
			System.out.println("Est� CALOR!");
		}
	}
}

