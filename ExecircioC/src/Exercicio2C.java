import java.util.Scanner;

public class Exercicio2C {
public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
double area, base, altura;
System.out.println("qual o valor da base?");
base = teclado.nextDouble();
System.out.println("qual o valor da altura? ");
altura = teclado.nextDouble();
area = (base*altura) /2;
System.out.println("a área do triângolo é:" +area);
}
}
