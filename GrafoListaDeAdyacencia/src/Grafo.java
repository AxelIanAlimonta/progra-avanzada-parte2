import java.util.ArrayList;

public class Grafo {
	private ArrayList<ArrayList<Nodo>> listaDeAdyacencia;

	public Grafo(int cantNodos) {
		listaDeAdyacencia = new ArrayList<ArrayList<Nodo>>();
		for (int i = 0; i <= cantNodos; i++) {
			listaDeAdyacencia.add(i, new ArrayList<Nodo>());
		}
	}

	public void setArista(int nodo1, int nodo2, int pesoArista) {
		listaDeAdyacencia.get(nodo1).add(new Nodo(nodo2, pesoArista));
		listaDeAdyacencia.get(nodo2).add(new Nodo(nodo1, pesoArista));
	}

	@Override
	public String toString() {
		String sal = "";
		for (int i = 1; i < listaDeAdyacencia.size(); i++) {
			sal+="nodo "+i+": ";
			for(Nodo nodo:listaDeAdyacencia.get(i)) {
				sal+=nodo+" ";
			}
			sal+="\n";
		}
		return sal;
	}
}
