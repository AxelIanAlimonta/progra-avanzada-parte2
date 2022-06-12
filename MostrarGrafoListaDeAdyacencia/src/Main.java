
public class Main {

	public static void main(String[] args) {
		Grafo grafo=new Grafo(8);
		grafo.agregarArista(1, 2, 7);
		grafo.agregarArista(1, 4, 5);
		grafo.agregarArista(2, 4, 9);
		grafo.agregarArista(2, 5, 7);
		grafo.agregarArista(2, 3, 8);
		grafo.agregarArista(3, 5, 5);
		grafo.agregarArista(4, 5, 15);
		grafo.agregarArista(4, 6, 6);
		grafo.agregarArista(5, 6, 8);
		grafo.agregarArista(5, 7, 9);
		grafo.agregarArista(6, 7, 11);

		System.out.println(grafo);
	}
	

	
}
