
import java.util.Scanner;

public class Sacarpromedio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("numero1"); 
        int n1 = scanner.nextInt();
        System.err.println("numero2");
        int n2 = scanner.nextInt();
        System.err.println("numero3");
        int n3 = scanner.nextInt();
        int Suma = (n1 + n2 + n3);
        float promedio = (Suma / 3);
        System.out.println(".(El promedio de los numeros es " +promedio);

    }
}