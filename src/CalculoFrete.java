import java.util.Scanner;
public class CalculoFrete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor da sua compra para calcularmos o frete.");
		double valor = scan.nextDouble();
	
		if(valor < 50.00) {
			System.out.println("Seu frete é de R$10,00");
		}
		else if(valor >= 50.00 && valor <= 100.00) {
			System.out.println("Seu frete é de R$7,00");
		}
		else {
			System.out.println("Seu frete é grátis");
		}
	scan.close(); 
	}
}

