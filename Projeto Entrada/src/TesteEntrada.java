import java.util.Scanner;

public class TesteEntrada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um valor inteiro: ");
		int valor = teclado.nextInt();
		System.out.println("você digitou: " + valor);

	}
}
