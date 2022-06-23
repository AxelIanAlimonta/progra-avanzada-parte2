
public class Grafo {
	private int cantNodos;
	private int[][] matAdy;
	private boolean[] visitados;
	private int[] pesos;
	private final int inf = 30000;
	private int primerNodo = 0;

	public Grafo(int cantNodos) {
		this.cantNodos = cantNodos;
		matAdy = new int[cantNodos + 1][cantNodos + 1];
		
		for(int i=1;i<=cantNodos;i++)
			for(int j=0;j<=cantNodos;j++)
				matAdy[i][j]=inf;
		
		visitados = new boolean[cantNodos + 1];
	}

	public void setTunel(int i, int j) {
		if (primerNodo == 0) {
			primerNodo = i;
		}
		matAdy[i][j] = 1;
		matAdy[j][i] = 1;

	}

	public void setPuente(int i, int j) {
		matAdy[j][i] = 2;
		matAdy[i][j] = 2;
	}

	public int cantPuentesNecesarios() {
		int cantPuentes = 0;
		pesos = new int[cantNodos + 1];
		for (int i = 1; i <= cantNodos; i++) {
			pesos[i] = inf;
		}
		visitados[primerNodo] = true;
		int ultimoVisitado = primerNodo;

		// actualizar pesos
		int cantVisitados = 1;
		while (cantVisitados < cantNodos) {
			for (int i = 1; i <= cantNodos; i++) {
				if (!visitados[i] && matAdy[ultimoVisitado][i] < pesos[i]) {
					pesos[i] = matAdy[ultimoVisitado][i];
				}
			}
			// tomo el de menor peso
			int menorPeso = inf;
			int nodoMenorPeso = 0;
			for (int i = 1; i <= cantNodos; i++) {
				if (!visitados[i]&&pesos[i] < menorPeso) {
					nodoMenorPeso = i;
					menorPeso = pesos[i];
				}
			}
			// marco el de menor peso como visitado
			visitados[nodoMenorPeso] = true;
			ultimoVisitado = nodoMenorPeso;
			if (menorPeso == 2) {
				cantPuentes++;
			}
			cantVisitados++;
		}
		return cantPuentes;
	}
}
