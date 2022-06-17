import java.util.ArrayList;
import java.util.PriorityQueue;

public class Grafo {

	private int cantElem;
	private int[][] matAdy;
	final int inf = 30000;
	Nodo[] vecAntecesorCosto;

	public Grafo(int cantElem) {
		this.cantElem = cantElem;
		matAdy = new int[cantElem + 1][cantElem + 1];
		for (int i = 1; i <= cantElem; i++) {
			for (int j = 1; j <= cantElem; j++) {
				matAdy[i][j] = inf;
			}
		}
	}

	public void setArista(int nodo1, int nodo2, int peso) {
		matAdy[nodo1][nodo2] = peso;
	}

	public Nodo[] dijkstra(int origen) {
		vecAntecesorCosto = new Nodo[cantElem + 1];
		boolean[] visitados = new boolean[cantElem + 1];
		PriorityQueue<Nodo> cola = new PriorityQueue<Nodo>();

		for (int i = 1; i <= cantElem; i++) {
			vecAntecesorCosto[i] = new Nodo(origen, inf);
		}
		vecAntecesorCosto[origen].costo = 0;

		cola.add(new Nodo(origen, 0));

		while (!cola.isEmpty()) {
			Nodo actual = cola.poll();
			visitados[actual.nodo] = true;

			for (int i = 1; i <= cantElem; i++) {
				if (!visitados[i] && matAdy[actual.nodo][i] + actual.costo < vecAntecesorCosto[i].costo) {
					cola.add(new Nodo(i, matAdy[actual.nodo][i] + actual.costo));
					vecAntecesorCosto[i].nodo = actual.nodo;
					vecAntecesorCosto[i].costo = matAdy[actual.nodo][i] + actual.costo;
				}

			}
		}
		return vecAntecesorCosto;
	}

	public String caminoCostoDestOrig(int orig, int dest) {
		dijkstra(orig);
		String sal = "";
		sal += "Costo:" + vecAntecesorCosto[dest].costo;

		ArrayList<Integer> camino = new ArrayList<Integer>();
		int nodo = dest;
		camino.add(nodo);

		while (nodo != orig) {
			camino.add(0, vecAntecesorCosto[nodo].nodo);
			nodo = vecAntecesorCosto[nodo].nodo;
		}
		
		sal+="\nCamino: ";
		for(int nro:camino) {
			sal+=nro+" ";
		}
		

		return sal;

	}

}
