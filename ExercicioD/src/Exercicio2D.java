import java.util.Scanner;

public class Exercicio2D {
public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
double area, diagonal1, diagonal2;
System.out.println("qual o valor da diagonal1? ");
diagonal1 = teclado. nextDouble();
System.out.println("qual o valor da diagonal2? ");
diagonal2 = teclado. nextDouble();
area = diagonal1*diagonal2;
System.out.println("a aárea do losango é: "+area);
}
}
