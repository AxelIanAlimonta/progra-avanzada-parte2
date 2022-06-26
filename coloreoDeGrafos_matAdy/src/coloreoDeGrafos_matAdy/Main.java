package coloreoDeGrafos_matAdy;

public class Main {

	public static void main(String[] args) {
		int cantNodos=7;
		Grafo grafo = new Grafo(cantNodos);
		grafo.setArista(1, 2);
		grafo.setArista(1, 4);
		grafo.setArista(1, 3);
		grafo.setArista(1, 6);
		grafo.setArista(2, 4);
		grafo.setArista(5, 2);
		grafo.setArista(3, 4);
		grafo.setArista(3, 6);
		grafo.setArista(4, 6);
		grafo.setArista(5, 7);
		grafo.setArista(6, 7);
		
//		grafo.setArista(1,4);
//		grafo.setArista(1,3);
//		grafo.setArista(2,3);
//		grafo.setArista(2,4);
//		grafo.setArista(1,2);
		
		grafo.colorearGrafo();

		System.out.println(grafo.mostrarColores());
	}

}
