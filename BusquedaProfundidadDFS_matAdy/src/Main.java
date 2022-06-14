
public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(7);
		
		grafo.setArista(3, 1);
		grafo.setArista(3, 4);
		grafo.setArista(4, 2);
		grafo.setArista(1, 2);
		grafo.setArista(2, 5);
		grafo.setArista(2, 7);
		grafo.setArista(5, 6);
		grafo.setArista(7, 6);
		
		System.out.println(grafo.DFS(3));
	}
}
