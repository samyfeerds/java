import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("digite sua primeira nota:");
		nota1 = teclado.nextDouble();
		System.out.println("digite sua segunda nota:");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("sua m�dia vale:" + media);
		if (media >= 8 && media <= 10) {
			System.out.println("voc� foi aprovado com louvor!");

		} else if (media >= 6 && media <= 8) {
			System.out.println("voc� foi aprovado");
		} else if (media >= 5 && media < 6) {
			System.out.println("voc� est� em recupera��o");
		} else {
			System.out.println("reprovado");
		}
	}
}
