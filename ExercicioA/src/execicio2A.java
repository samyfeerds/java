import java.util.Scanner;

public class execicio2A {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
double area, lado;
System.out.println("digite o valor do lado:");
lado = teclado.nextDouble();
area = lado*lado;
System.out.println("a área do quadrado vale: " +area );
}
}
