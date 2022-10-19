/*Clase donde se crea un grafo con matriz de adyacencia*/
package sesion14;

public class GrafoMA {

    private int numVertices;
    private int ma[][];

    public GrafoMA(int n) {
        ma = new int[n][n];
        numVertices = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ma[i][j] = 0;
            }
        }
    }

    public void imprimeMatriz() {
        System.out.println("EL grafo contiene " + numVertices + " vertices");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(ma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void insertaArista(int i, int j) {
        ma[i][j] = 1;
    }

    public void eliminarArista(int i, int j) {
        ma[i][j] = 0;
    }

    public int gradoEntrada(int j) {
        int ge = 0;
        for (int i = 0; i < numVertices; i++) {
            if (ma[i][j] == 1) {
                ge++;
            }
        }
        return ge;
    }

    public int gradoSalida(int i) {
        int gs = 0;
        for (int j = 0; j < numVertices; j++) {
            if (ma[i][j] == 1) {
                gs++;
            }
        }
        return gs;
    }

    public void mostrarAdyacentes(int i) {
        for (int j = 0; j < numVertices; j++) {
            if (ma[i][j] == 1) {
                System.out.println(j);
            }

        }
    }
}
