
public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(10);
		
		grafo.setArista(9, 1);		
		grafo.setArista(1, 3);		
		grafo.setArista(8, 3);		
		grafo.setArista(3, 7);		
		grafo.setArista(7, 8);		
		grafo.setArista(7, 5);		
		grafo.setArista(7, 10);		
		grafo.setArista(2, 3);		
		grafo.setArista(2, 4);		
		grafo.setArista(5, 4);		
		grafo.setArista(5, 6);		
		grafo.setArista(6, 10);		
		
		grafo.recorrerGrafoDesdeNodo(9);
	}
}
