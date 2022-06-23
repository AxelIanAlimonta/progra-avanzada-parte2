import java.util.ArrayList;
import java.util.PriorityQueue;

public class Grafo {
	private int cantNodos;
	private int[][] matAdy;
	protected int principe;
	protected int princesa;
	protected ArrayList<Integer>posDragones=new ArrayList<Integer>();
	protected Nodo[]pesos;
	final int inf=30000;
	
	public Grafo(int cantNodos) {
		this.cantNodos=cantNodos;
		matAdy=new int [cantNodos+1][cantNodos+1];
		for(int i=1;i<=cantNodos;i++)
			for(int j=0;j<=cantNodos;j++)
				matAdy[i][j]=inf;
	}

	public void setArista(int nodo1, int nodo2, int peso) {
		matAdy[nodo1][nodo2]=peso;
		matAdy[nodo2][nodo1]=peso;
	}
	
	public void Dijkstra() {
		pesos=new Nodo[cantNodos+1];//tiene el peso y el antecesor de cada nodo
		PriorityQueue<Nodo>cola=new PriorityQueue<Nodo>();//Cola de prioridad ordenada por pesos de forma ascendente
		boolean []visitados=new boolean[cantNodos+1];
		

		for(int i=1;i<=cantNodos;i++) {
			pesos[i]=new Nodo(princesa,inf);
		}
		pesos[princesa].id=0;
		pesos[princesa].peso=0;
		
		cola.add(new Nodo(princesa,0));
		while(!cola.isEmpty()) {
			Nodo antecesorActual=cola.poll();
			visitados[antecesorActual.id]=true;
			
			for(int i=1;i<=cantNodos;i++) {
				if(!visitados[i]&&((antecesorActual.peso+matAdy[antecesorActual.id][i])<pesos[i].peso)) {
					pesos[i]=new Nodo(antecesorActual.id,antecesorActual.peso+matAdy[antecesorActual.id][i]);
					cola.add(new Nodo(i,antecesorActual.peso+matAdy[antecesorActual.id][i]));
				}
			}
		}
		
	}
	
	@Override
	public String toString() {
		String sal="";
		for(int i=1;i<=cantNodos;i++) {
			for(int j=1;j<=cantNodos;j++)
				sal+=matAdy[i][j]+" ";
			sal+="\n";
		}
		return sal;
	}
	
	public String retornarRespuesta() {
		String sal="";
		
		if(pesos[principe].peso==inf)
			return "NO HAY CAMINO";
		
		for(int pos:posDragones) {
			if(pesos[pos].peso<=pesos[principe].peso) 
				return "INTERCEPTADO";
		}
		
		int origen=princesa;
		int destino=principe;
		
		while(origen!=destino) {
			sal+=destino+" ";
			destino=pesos[destino].id;
		}
		sal+=destino;
		
		return sal;
	}
	
}
