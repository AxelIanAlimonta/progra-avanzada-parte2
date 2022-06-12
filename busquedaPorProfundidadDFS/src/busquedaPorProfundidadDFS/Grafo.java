package busquedaPorProfundidadDFS;

public class Grafo {
	private int [][]matrizDeAdyacencia;
	
	public Grafo(int cantNodos) {
		matrizDeAdyacencia=new int[cantNodos][cantNodos];
	}
	
	public void setArista(int nodo1,int nodo2) {
		matrizDeAdyacencia[nodo1][nodo2]=1;
		matrizDeAdyacencia[nodo2][nodo1]=1;
	}
	
}
