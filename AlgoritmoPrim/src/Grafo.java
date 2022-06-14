import java.util.ArrayList;

public class Grafo {

	private ArrayList<ArrayList<Nodo>> listaDeAdyacencia = new ArrayList<ArrayList<Nodo>>();
	private int cantVertices;

	public Grafo(int cantVertices) {
		this.cantVertices = cantVertices;
		for (int i = 0; i <= cantVertices; i++) {
			listaDeAdyacencia.add(i, new ArrayList<Nodo>());
		}
	}

	public void agregarArista(int nodo1, int nodo2, int peso) {
		listaDeAdyacencia.get(nodo1).add(new Nodo(nodo2, peso));
		listaDeAdyacencia.get(nodo2).add(new Nodo(nodo1, peso));
	}

	@Override
	public String toString() {
		String sal = "";

		sal += "Grafo:\n";

		sal += "Vertice/peso\n";
		for (int i = 1; i < cantVertices; i++) {
			for (Nodo ndo : listaDeAdyacencia.get(i)) {
				sal += "(" + i + "," + ndo.getId() + ")" + "/" + ndo.getPeso() + "  ";
			}
			sal += "\n";
		}

		return sal;
	}

	public int PrimCostoMinimo() {
		int vecCostos[] = new int[cantVertices + 1];
		for (int i = 1; i <= cantVertices; i++) {
			vecCostos[i] = 30000;
		}

		ArrayList<Nodo> visitados = new ArrayList<Nodo>();
		visitados.add(new Nodo(0, 0));
		visitados.add(new Nodo(1, 0));
		vecCostos[1]=0;

		while (visitados.size() != (cantVertices + 1)) {
			int ultimoVisitado = visitados.get(visitados.size()-1).getId();

			//actualizar vector de costos
			for (Nodo nod : listaDeAdyacencia.get(ultimoVisitado)) {
				if (!estaVisitado(visitados, nod) && nod.getPeso() < vecCostos[nod.getId()]) {
					vecCostos[nod.getId()] = nod.getPeso();
				}
			}
			
			//tomar costo mas chico
			int costoMasChico=30000;
			int elemtoAVisitar=0;
			for(int i=1;i<vecCostos.length;i++) {
				if(!estaVisitado(visitados, new Nodo(i,0))&&vecCostos[i]<costoMasChico) {
					costoMasChico=vecCostos[i];
					elemtoAVisitar=i;
				}
			}
			visitados.add(new Nodo(elemtoAVisitar,costoMasChico));
		}
		
		//calculamos la suma de costos final
		int costoTotal=0;
		for(int i=1;i<vecCostos.length;i++) {
			costoTotal+=vecCostos[i];
		}

		return costoTotal;
	}

	private boolean estaVisitado(ArrayList<Nodo> visitados, Nodo nodoABuscar) {
		for (int i = 1; i < visitados.size(); i++) {
			if (visitados.get(i).compareTo(nodoABuscar) == 0)
				return true;
		}
		return false;
	}

}
