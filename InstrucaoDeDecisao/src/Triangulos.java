import java.util.Scanner;
public class Triangulos {
	public static void main(String[] args) {
		Scanner bols = new Scanner(System.in);
		System.out.println("Digite os três lados do triângulo para diferenciarmos sua forma");
		int a = bols.nextInt(); 
		int b = bols.nextInt(); 
		int c = bols.nextInt();
		
		if(a != b && a != c && c != b) {
			System.out.println("Seu triangulo é escaleno");
		}
		else if (a == b && a == c && b == c) {
			System.out.println("Seu triangulo é equilatero");
		}
	else if( a == b || b == a || a == c || b == c) {
			System.out.println("Seu triangulo é isosceles");
		}
		
		else {
			System.out.println("Não forma triangulo");
		}
	bols.close();}
}
