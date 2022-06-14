
public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(7);
		
		grafo.insertarArista(3, 1);
		grafo.insertarArista(3, 4);
		grafo.insertarArista(1, 2);
		grafo.insertarArista(4, 2);
		grafo.insertarArista(5, 2);
		grafo.insertarArista(7, 2);
		grafo.insertarArista(6, 5);
		grafo.insertarArista(6, 7);
		
		
		System.out.println(grafo.BFS(3));
	}
}
