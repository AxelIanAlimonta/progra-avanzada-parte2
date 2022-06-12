package busquedaPorProfundidadDFS;

public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(11);
		
		grafo.setArista(1, 2);
		grafo.setArista(2, 3);
		grafo.setArista(3, 4);
		grafo.setArista(4, 5);
		grafo.setArista(1, 6);
		grafo.setArista(6, 7);
		grafo.setArista(7, 8);
		grafo.setArista(9, 8);
		grafo.setArista(10, 9);
		grafo.setArista(10, 11);
		grafo.setArista(11, 1);
		
		grafo.recorrerGrafo(1);		
	}
}
