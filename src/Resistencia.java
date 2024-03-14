import java.util.Scanner;

public class Resistencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el valor de las 3 resistencias
        System.out.println("Ingrese el valor de la resistencia 1:");
        double resistencia1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la resistencia 2:");
        double resistencia2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la resistencia 3:");
        double resistencia3 = scanner.nextDouble();

        // Verificar que todas las resistencias sean positivas
        if (resistencia1 <= 0 || resistencia2 <= 0 || resistencia3 <= 0) {
            System.out.println("Error: Todas las resistencias deben ser positivas.");
            return;
        }

        // Calcular la resistencia total
        double resistenciaTotal = 1 / ((1 / resistencia1) + (1 / resistencia2) + (1 / resistencia3));

        // Mostrar el resultado en la consola
        System.out.println("La resistencia total es de: " + resistenciaTotal);

        scanner.close();
    }
}
