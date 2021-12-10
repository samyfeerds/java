import java.util.Scanner;

public class Energia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, kw, quantidade, total, totalcomdesconto;
		System.out.println("qual o valor do salário mínimo?");
		salario = teclado.nextDouble();
		System.out.println("quantos kw foram gastos?");
		quantidade = teclado.nextDouble();
		kw = salario / 700;

		total =  kw * quantidade;
		totalcomdesconto = total * 0.9;
		System.out.println("o total final é:" + total);
		System.out.println("total com desconto é:" + totalcomdesconto);
		System.out.println("ovalor do kw é:" + kw);
	};
}
