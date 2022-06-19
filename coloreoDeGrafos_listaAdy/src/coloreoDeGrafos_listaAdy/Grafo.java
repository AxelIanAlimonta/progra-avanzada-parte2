package coloreoDeGrafos_listaAdy;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Grafo {
	private int cantElem;
	Nodo[] nodos;

	public Grafo(int cantElem) {
		this.cantElem = cantElem;
		nodos = new Nodo[cantElem + 1];
		for (int i = 1; i <= cantElem; i++) {
			nodos[i] = new Nodo(i);
		}
	}

	public void setArista(int nodo1, int nodo2) {
		nodos[nodo1].listaAdy.add(nodo2);
		nodos[nodo2].listaAdy.add(nodo1);
		nodos[nodo1].cantAdy++;
		nodos[nodo2].cantAdy++;
	}

	public void colorearGrafo() {
		PriorityQueue<Nodo> nodosOrdenadosPorNivel = new PriorityQueue<Nodo>();

		for (int i = 1; i <= cantElem; i++) {
			nodosOrdenadosPorNivel.add(nodos[i]);
		}

		while (!nodosOrdenadosPorNivel.isEmpty()) {
			Nodo actual = nodosOrdenadosPorNivel.poll();
			boolean[] coloresNoDisponible = new boolean[cantElem + 1];

			// marco colores que no estan disponibles
			for (int nro : nodos[actual.id].listaAdy) {
				coloresNoDisponible[nodos[nro].color] = true;
			}

			boolean coloreado = false;
			int color = 1;
			while (!coloreado) {
				if (!coloresNoDisponible[color]) {
					nodos[actual.id].color = color;
					coloreado = true;
				}
				color++;
			}
		}
	}

	public String mostrarNodosOrdenadosPorColor() {
		String sal="";
		for(int i=1;i<=cantElem;i++) {//color
			sal+="color "+i+": ";
			for(int j=1;j<=cantElem;j++) {//elem
				if(nodos[j].color==i) {
					sal+=nodos[j].id+" ";
				}
			}
			sal+="\n";
		}
		return sal;
	}
}
