package numeroInteiro;
import java.util.Scanner;
public class programasSalarios {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		double salario, salarioM, diferenca;
		System.out.println("Digite aqui o seu salario");
		salario = in.nextDouble();
		System.out.println("Digite aqui o salário mínimo");
		salarioM = in.nextDouble();
		if(salario > salarioM) {
			diferenca = salario - salarioM;
			System.out.println("A pessoa recebe acima do salário mínimo. Recebe R$" + diferenca + "a mais");
		}else if (salarioM > salario) {
			diferenca = salarioM - salario;
			System.out.println("A pessoa recebe abaixo do salário mínimo. Recebe R$" + diferenca + "a menos");
		}else {
	           System.out.println("A pessoa recebe exatamente o salário mínimo!");

		}
		}
				
		
		
}
