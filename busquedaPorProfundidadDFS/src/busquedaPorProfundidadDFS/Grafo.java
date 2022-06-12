package busquedaPorProfundidadDFS;

import java.util.Stack;

public class Grafo {
	private int [][]matrizDeAdyacencia;
	private Stack<Integer>pila=new Stack<Integer>();
	boolean[]visitados;
	
	public Grafo(int cantNodos) {
		matrizDeAdyacencia=new int[cantNodos+1][cantNodos+1];
		visitados=new boolean[cantNodos+1];
	}
	
	public void setArista(int nodo1,int nodo2) {
		matrizDeAdyacencia[nodo1][nodo2]=1;
		matrizDeAdyacencia[nodo2][nodo1]=1;
	}
	
	public void recorrerGrafo(int nodo) {
		visitados[nodo]=true;
		pila.push(nodo);
		while(!pila.empty()) {
			nodo=pila.pop();
			mostrarNodo(nodo);
			for(int i=1;i<matrizDeAdyacencia.length;i++) {
				if(matrizDeAdyacencia[nodo][i]==1&&visitados[i]==false) {
					visitados[i]=true;
					pila.push(i);
				}				
			}
		}
	}
	
	private void mostrarNodo(int nodo) {
		System.out.print(nodo+" ");
	}
}
