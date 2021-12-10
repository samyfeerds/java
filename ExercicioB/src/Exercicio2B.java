import java.util.Scanner;

public class Exercicio2B {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double area, base, altura;
		System.out.println("quanto mede a base? ");
		base = teclado.nextDouble();
		System.out.println("qual o valor da altura? ");
		altura = teclado.nextDouble();
		area = base * altura;
		System.out.println("a área do retângulo é:  " + area);
	}
}
