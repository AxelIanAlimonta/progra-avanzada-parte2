
public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(7);
		
		grafo.setArista(1,2,6);
		grafo.setArista(1,4,1);
		grafo.setArista(1,3,4);
		grafo.setArista(2,4,2);
		grafo.setArista(2,5,3);
		grafo.setArista(3,6,5);
		grafo.setArista(4,3,5);
		grafo.setArista(4,6,8);
		grafo.setArista(5,4,1);
		grafo.setArista(5,7,3);
		grafo.setArista(7,6,9);
		

		System.out.println(grafo.caminoCostoDestOrig(2, 2));
		
	}
}
