public class BusquedaBinaria {
    public static int busquedaBinaria(int[] arr, int valor) {
        int inicio = 0, fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == valor)
                return medio;
            if (arr[medio] < valor)
                inicio = medio + 1;
            else
                fin = medio - 1;
        }
        return -1;
    }

    public static int busquedaBinariaRecursiva(int[] arr, int inicio, int fin, int valor) {
        if (fin >= inicio) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == valor)
                return medio;
            if (arr[medio] > valor)
                return busquedaBinariaRecursiva(arr, inicio, medio - 1, valor);

            return busquedaBinariaRecursiva(arr, medio + 1, fin, valor);
        }
        return -1;
    }
}
