    import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {

		String nome; 
		double salario_fixo; 
		double vendas_mes; 

		Scanner numero = new Scanner(System.in);

		System.out.println("Informe o nome do Funciónario: "); 
		nome = numero.nextLine(); 

		System.out.println("Informe o salário fixo: "); 
		salario_fixo = numero.nextDouble(); 

		System.out.println("Informe as vendas no mês: "); 
		vendas_mes = numero.nextDouble(); 

		double total_vendas_mes = salario_fixo + vendas_mes * 0.15 ; 

		System.out.println("O Funcionario: " + nome);
		System.out.printf("Vai receber no de Total que o funcionário vai receber: R$ %.2f", total_vendas_mes);
	}
}
