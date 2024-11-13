public class MedicionTiempos {
    public static void medirTiempo(int[] arr, String metodo) {
        int[] copiaArr = arr.clone();
        long inicio, fin;

        switch (metodo) {
            case "burbuja":
                inicio = System.nanoTime();
                Burbuja.burbuja(copiaArr);
                fin = System.nanoTime();
                break;
            case "selección":
                inicio = System.nanoTime();
                Seleccion.seleccion(copiaArr);
                fin = System.nanoTime();
                break;
            case "inserción":
                inicio = System.nanoTime();
                Insercion.insercion(copiaArr);
                fin = System.nanoTime();
                break;
            default:
                throw new IllegalArgumentException("Método desconocido: " + metodo);
        }
        System.out.println("Tiempo para " + metodo + " con " + arr.length + " elementos: " + (fin - inicio) + " nanosegundos");
    }
}
