import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double km, litros, media;
		System.out.println("por favor, digite qual a dist�ncia percorrida");
		km = teclado.nextDouble();
		System.out.println("quantos litros foram gastos");
		litros = teclado.nextDouble();
		media=km/litros;
		System.out.println("o consumo m�dio foi de:"+media);
	}
}
