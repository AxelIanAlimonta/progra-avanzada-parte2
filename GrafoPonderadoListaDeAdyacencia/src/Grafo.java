import java.util.ArrayList;

public class Grafo {

	private ArrayList<ArrayList<Nodo>>listaDeAdyacencia=new ArrayList<ArrayList<Nodo>>();
	private int cantVertices;
	
	public Grafo(int cantVertices) {
		this.cantVertices=cantVertices;
		for(int i=0;i<=cantVertices;i++) {
			listaDeAdyacencia.add(i,new ArrayList<Nodo>());
		}
	}
	
	public void agregarArista(int nodo1,int nodo2,int peso) {
		listaDeAdyacencia.get(nodo1).add(new Nodo(nodo2,peso));
		listaDeAdyacencia.get(nodo2).add(new Nodo(nodo2,peso));		
	}
	
	@Override
	public String toString() {
		String sal="";
		
		sal+="Grafo:\n";
		
		sal+="Vertice/peso\n";
		for(int i=1;i<cantVertices;i++) {
			for(Nodo ndo:listaDeAdyacencia.get(i)) {
				sal+="("+i+","+ndo.getId()+")"+"/"+ndo.getPeso()+"  ";
			}
			sal+="\n";
		}
		
		return sal;
	}
	
}
