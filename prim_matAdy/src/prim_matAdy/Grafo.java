package prim_matAdy;

import java.util.ArrayList;

public class Grafo {

	private int cantNodos;
	private int[][] matAdy;
	private ArrayList<Arista> listaDeAristasMenorCosto = new ArrayList<Arista>();
	int[] pesos;

	public Grafo(int cantNodos) {
		this.cantNodos = cantNodos;
		matAdy = new int[cantNodos + 1][cantNodos + 1];
	}

	public void setArista(Arista ar) {
		matAdy[ar.nodo1][ar.nodo2] = ar.peso;
		matAdy[ar.nodo2][ar.nodo1] = ar.peso;
	}

	public ArrayList<Arista> Prim() {
		boolean[] visitados = new boolean[cantNodos + 1];
		pesos = new int[cantNodos + 1];
		int[]antecesor=new int[cantNodos+1];
		final int inf = 30000;
		int cantDeVisitados = 0;

		for (int i = 1; i <= cantNodos; i++) {
			pesos[i] = inf;
		}

		int ultimoVisitado = 1;
		pesos[ultimoVisitado] = 0;
		visitados[ultimoVisitado] = true;
		cantDeVisitados++;

		while (cantDeVisitados < cantNodos) {
			// actualizo pesos
			for (int i = 1; i <= cantNodos; i++) {
				if (!visitados[i] && (matAdy[ultimoVisitado][i] < pesos[i])) {
					pesos[i] = matAdy[ultimoVisitado][i];
					antecesor[i]=ultimoVisitado;
				}

			}

			// busco el peso mas bajo y agrego el nodo a visitados
			int pesoMasBajo = inf;
			int nodoConPesoMasBajo = 0;
			for (int i = 1; i <= cantNodos; i++) {
				if (!visitados[i] && pesos[i] < pesoMasBajo) {
					pesoMasBajo = pesos[i];
					nodoConPesoMasBajo = i;
				}
			}
			visitados[nodoConPesoMasBajo] = true;
			ultimoVisitado = nodoConPesoMasBajo;
			listaDeAristasMenorCosto.add(new Arista(antecesor[nodoConPesoMasBajo],nodoConPesoMasBajo,pesoMasBajo));
			cantDeVisitados++;
		}

		return listaDeAristasMenorCosto;
	}
}
