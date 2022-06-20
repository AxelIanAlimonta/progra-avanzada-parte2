
public class Grafo {

	private int cantNodos;
	private int[][] matAdy;
	private final int inf = 30000;
	private int[][] matFloyd;

	public Grafo(int cantNodos) {
		this.cantNodos = cantNodos;
		matAdy = new int[cantNodos + 1][cantNodos + 1];

		for (int i = 1; i <= cantNodos; i++)
			for (int j = 1; j <= cantNodos; j++)
				matAdy[i][j] = inf;
		for (int i = 1; i <= cantNodos; i++)
			matAdy[i][i] = 0;
	}

	public void insertarArista(int nodo1, int nodo2, int peso) {
		matAdy[nodo1][nodo2] = peso;
//		matAdy[nodo2][nodo1]=peso;
	}

	public void floyd() {
		int[][] matAnterior = new int[cantNodos + 1][cantNodos + 1];

		copiarMat(matAdy, matAnterior);

 		for (int i = 1; i <= cantNodos; i++) {
			int[][] matActual = new int[cantNodos + 1][cantNodos + 1];
			copiarMat(matAnterior, matActual);

			for (int j = 1; j <= cantNodos; j++) {
				if (j != i && matAnterior[j][i] != inf) {
					for (int k = 1; k <= cantNodos; k++) {
						if (k != i) {
							if (matAnterior[j][i] + matAnterior[i][k] < matAnterior[j][k])
								matActual[j][k] = matAnterior[j][i] + matAnterior[i][k];
						}
					}
				}
			}
			matAnterior = matActual;

		}

		matFloyd = matAnterior;

	}

	private void copiarMat(int[][] matOrig, int[][] matDest) {
		for (int i = 1; i <= cantNodos; i++)
			for (int j = 1; j <= cantNodos; j++)
				matDest[i][j] = matOrig[i][j];
	}

	public void mostrarFloyd() {
		for (int i = 1; i <= cantNodos; i++) {
			for (int j = 1; j <= cantNodos; j++) {
				if (matFloyd[i][j] == inf) {
					System.out.print(" i");
				} else
					System.out.format("%-3d", matFloyd[i][j]);
			}
			System.out.println();
		}
	}
}
