import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tamaños = {10, 100, 1000, 5000, 10000, 30000};
        int valorBuscado = 4443;

        int[] arregloAnterior = new int[0]; 

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1.- Generar Arreglos aleatorios");
            System.out.println("2.- Ordenar por los 3 métodos");
            System.out.println("3.- Buscar valores con búsqueda binaria");
            System.out.println("4.- Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1: 
                    for (int tamaño : tamaños) {
                        if (arregloAnterior.length < tamaño) {
                            int[] nuevoArreglo = GeneradorArreglos.generarArregloCreciente(tamaño, arregloAnterior);
                            System.out.println("Arreglo de tamaño " + tamaño + " generado con los primeros " + arregloAnterior.length);
                            arregloAnterior = nuevoArreglo;
                        }
                    }
                    break;

                case 2:
                    for (int tamaño : tamaños) {
                        int[] arr = GeneradorArreglos.generarArregloCreciente(tamaño, arregloAnterior);
                        System.out.println("\nOrdenando arreglo de tamaño " + tamaño + ":");

                        MedicionTiempos.medirTiempo(arr, "burbuja");
                        MedicionTiempos.medirTiempo(arr, "seleccion");
                        MedicionTiempos.medirTiempo(arr, "insercion");
                    }
                    break;

                case 3:
                    for (int tamaño : tamaños) {
                        int[] arr = GeneradorArreglos.generarArregloCreciente(tamaño, arregloAnterior);
                        int posicion = BusquedaBinaria.busquedaBinaria(arr, valorBuscado);
                        System.out.println("Posición del valor " + valorBuscado + " en arreglo de tamaño " + tamaño + ": " + posicion);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}


