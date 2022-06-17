package prim_matAdy;

public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(4);
		
		grafo.setArista(new Arista(1,2,2));
		grafo.setArista(new Arista(1,4,4));
		grafo.setArista(new Arista(1,3,5));
		grafo.setArista(new Arista(2,3,3));
		grafo.setArista(new Arista(2,4,1));
		grafo.setArista(new Arista(3,4,2));
		
		for(Arista ar:grafo.Prim()) {
			System.out.println(ar);
		}
		
	}
	
}
