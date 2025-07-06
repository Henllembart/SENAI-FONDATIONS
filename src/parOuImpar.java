import java.util.Scanner;
public class parOuImpar {
	public static void main(String[] args) {
	Scanner novo = new Scanner(System.in);
	
	System.out.println("Digite um numero");
	int numero = novo.nextInt();
	
			if(numero % 2 == 0) {
		System.out.println("Seu numero digitado é par");
	}
	else {
		System.out.println("Seu numero é impar");
	}
		novo.close();
	}
	
	
}
