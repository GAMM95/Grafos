/*Clase que llama a la clase GrafoMA, crea un grafo 
con matriz de adyacencia además, dado un nodo v, reporta sus nodos adyacentes
 */
package sesion14;

import java.util.Scanner;

public class ProyectoGrafoMA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i, j, cost;
        System.out.println("Numero de vertices: ");
        n = entrada.nextInt();
        GrafoMA grafo = new GrafoMA(n);
        String resp;
        do {
            System.out.println("Vertice inicial: ");
            i = entrada.nextInt();
            System.out.println("Vertice final: ");
            j = entrada.nextInt();
            grafo.insertaArista(i, j);
            System.out.println("Desea Ingresar otra arista (s/n)");
            resp = entrada.next().toUpperCase();
        } while (resp.equalsIgnoreCase("s"));
        grafo.imprimeMatriz();
        int op = 0;
        do {
            System.out.println("[1] Grado de entrada y salida: ");
            System.out.println("[2] Recorrido en profundida: ");
            System.out.println("[3] Recorrio en anchura: ");
            System.out.println("[4] Salir: ");
            System.out.println("OP: ");
            op = entrada.nextInt();
            switch (op) {

                case 1:
                    do {
                        System.out.println("Ingrese numero de nodo");
                        j = entrada.nextInt();
                        System.out.println("EL grado de entrada es:" + grafo.gradoEntrada(j));
                        System.out.println("El grado de salida es:" + grafo.gradoSalida(i));
                        System.out.println("otro nodo? (s/n)");
                        resp = entrada.next().toLowerCase();

                    } while (resp.equalsIgnoreCase("s"));
                    break;

                case 2:
                    System.out.println("Ingrese el nodo de inicio:");
                    i = entrada.nextInt();
                    System.out.println("El recorrido en anchura es: ");

                    break;

                case 3:

                    System.out.println("Ingrese el nodo de inicio:");
                    i = entrada.nextInt();
                    System.out.println("El recorrido en profundidad es: ");

                    break;
            }
        } while (op != 4);
    }
}
