import java.util.ArrayList;

public class Grafo {

	int cantNodos;
	private int matAdy[][];
	private final int inf = 30000;
	private Grafo resultadoPrim;
	private boolean visitados[];
	private Arista pesos[];


	public Grafo(int cantNodos) {
		this.cantNodos = cantNodos;
		matAdy = new int[cantNodos + 1][cantNodos + 1];
		for (int i = 0; i <= cantNodos; i++) {
			for (int j = 0; j <= cantNodos; j++) {
				matAdy[i][j] = inf;
			}
		}
	}

	public void setArista(Arista ar) {
		matAdy[ar.nodo1][ar.nodo2] = ar.peso;
		matAdy[ar.nodo2][ar.nodo1] = ar.peso;
	}

	public Grafo prim(ArrayList<Integer> conectados) {
		resultadoPrim = new Grafo(cantNodos + 1);
		visitados = new boolean[cantNodos + 1];
		pesos = new Arista[cantNodos + 1];
		int contConectados=conectados.size();
		
		for(int i=0;i<=cantNodos;i++) {
			pesos[i]=new Arista(i,i,inf);
		}
		
		int nodoActual = 0;
		for (int nro : conectados) {
			visitados[nro] = true;
			nodoActual=nro;
		}		
		
		while(contConectados<cantNodos) {
			actualizarPesos(nodoActual);
			Arista aristaMenorPeso=buscarMenorPeso();
			resultadoPrim.setArista(aristaMenorPeso);
			visitados[aristaMenorPeso.nodo2]=true;
			nodoActual=aristaMenorPeso.nodo2;
			contConectados++;			
		}

		return resultadoPrim;
	}

	private void actualizarPesos(int nodo) {
		for(int i=1;i<=cantNodos;i++) {
			if(!visitados[i]&&matAdy[nodo][i]<pesos[i].peso) {
				pesos[i].nodo1=nodo;
				pesos[i].nodo2=i;
				pesos[i].peso=matAdy[nodo][i];
			}
		}
	}
	
	private Arista buscarMenorPeso() {
		Arista menorPeso=new Arista(0,0,inf);
		for(Arista actual:pesos) {
			if(visitados[actual.nodo2]&&actual.peso<menorPeso.peso) {
				menorPeso.nodo1=actual.nodo1;
				menorPeso.nodo2=actual.nodo2;
				menorPeso.peso=actual.peso;
			}
		}
		return menorPeso;
	}
	
	@Override
	public String toString() {
		String sal = "";

		for (int i = 1; i <= cantNodos; i++) {
			for (int j = (i + 1); j <= (cantNodos); j++) {
				if (matAdy[i][j] != inf)
					sal += i + " " + j + " " + matAdy[i][j] + "\n";
			}
		}
		return sal;
	}

}
