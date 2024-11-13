import java.util.Random;
import java.util.Arrays;

public class GeneradorArreglos {
    private static final Random random = new Random();

    public static int[] generarArreglo(int tamaño) {
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(30000) + 1;
        }
        return arreglo;
    }

    public static int[] generarArregloCreciente(int tamaño, int[] arregloAnterior) {
        int[] nuevoArreglo = Arrays.copyOf(arregloAnterior, tamaño);
        for (int i = arregloAnterior.length; i < tamaño; i++) {
            nuevoArreglo[i] = random.nextInt(30000) + 1;
        }
        return nuevoArreglo;
    }
}

