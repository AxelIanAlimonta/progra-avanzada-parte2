import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
	private int[][] matrizDeAdyacencia;
	private Queue<Integer>cola=new LinkedList<Integer>();
	boolean[]visitados;

	
	public Grafo(int cantNodos) {
		matrizDeAdyacencia = new int[cantNodos+1][cantNodos+1];
		visitados=new boolean[cantNodos+1];
	}

	public void setArista(int nodo1, int nodo2) {
		matrizDeAdyacencia[nodo1][nodo2]=1;
		matrizDeAdyacencia[nodo2][nodo1]=1;
	}
	
	public void recorrerGrafoDesdeNodo(int nodo) {
		cola.add(nodo);
		visitados[nodo]=true;
		while(!cola.isEmpty()) {
			nodo=cola.poll();
			mostrarNodoVisitado(nodo);
			
			for(int i=1;i<(matrizDeAdyacencia[nodo].length);i++) {
				if(matrizDeAdyacencia[nodo][i]==1&&!visitados[i]) {
					visitados[i]=true;
					cola.add(i);
				}		
			}
		}
	}
	private void mostrarNodoVisitado(int nodo) {
		System.out.print(nodo+" ");
	}
	

}
