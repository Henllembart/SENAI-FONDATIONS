import java.util.Scanner;
public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva um numero de 1 a 7, sendo eles o numero da semana, como 1 = domingo, 2 = segunda e etc");
		int dia = scan.nextInt();
		
		if(dia == 1) {
			System.out.println("1 é igual a domingo");
		}
		else if(dia == 2) {
			System.out.println("2 é igual a segunda-feira");
		}
		else if(dia == 3) {
			System.out.println("3 é igual a terça-feira");
		}
		else if(dia == 4) {
			System.out.println("4 é igual a quarta-feira");
		}
		else if(dia == 5) {
			System.out.println("5 é igual a quinta-feira");
		}
		else if(dia == 6) {
			System.out.println("6 é igual a sexta-feira");
	}
		else if(dia == 7) {
			System.out.println("7 é igual a sabado");
		}
    scan.close();
    }
}