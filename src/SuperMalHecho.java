import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productos = new String[5];
        double[] precios = new double[5];
        double[] totales = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Escriba el nombre del producto " + (i + 1) + ":");
            productos[i] = scanner.nextLine();
            System.out.println("Ingrese el precio:");
            precios[i] = scanner.nextDouble();
            scanner.nextLine(); 

            double impuesto = precios[i] * 0.19;
            double descuento = (precios[i] > 10000) ? precios[i] * 0.10 : 0;
            totales[i] = precios[i] + impuesto - descuento;
        }

        double sumaTotal = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Producto: " + productos[i] + ", Precio final: " + totales[i]);
            sumaTotal += totales[i];
        }

        System.out.println("El total de la compra es: " + sumaTotal);

    scanner.close();
    }
}