import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("digite sua primeira nota:");
		nota1 = teclado.nextDouble();
		System.out.println("digite sua segunda nota:");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;

		if (media >= 6) {			if (media >= 6) {
				System.out.println("você foi aprovado!");
			}

		}
		else {
			System.out.println("você foi reprovado");
		}
	}
}
