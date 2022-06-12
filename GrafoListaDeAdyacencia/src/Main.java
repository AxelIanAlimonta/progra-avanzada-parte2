
public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(5);
		
		grafo.setArista(1, 2, 2);
		grafo.setArista(1, 3, 1);
		grafo.setArista(3, 4, 3);
		grafo.setArista(1, 4, 4);
		grafo.setArista(4, 5, 6);
		
		System.out.println(grafo);
	}
}
