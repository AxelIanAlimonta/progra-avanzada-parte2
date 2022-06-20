
public class Main {
	
	public static void main(String[] args) {
		
		Grafo grafo=new Grafo(4);
		
		grafo.insertarArista(1,2,3);
		grafo.insertarArista(1,4,4);
		grafo.insertarArista(2,3,5);
		grafo.insertarArista(3,1,8);
		grafo.insertarArista(4,3,3);
		
		
		grafo.floyd();
		grafo.mostrarFloyd();
	}
}
