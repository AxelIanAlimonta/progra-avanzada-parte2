package testGrafos;

public class Main {

	public static void main(String[] args) {
		Grafo grafo=new Grafo(5);
		
		grafo.setArista(1, 3);
		grafo.setArista(3, 4);
		grafo.setArista(1, 5);
		grafo.setArista(4, 3);
		grafo.setArista(5, 2);
		grafo.setArista(5, 4);
		grafo.setArista(1, 4);
		
		
		System.out.println(grafo);
		System.out.println(grafo.existeArista(1, 1));
	}
}
