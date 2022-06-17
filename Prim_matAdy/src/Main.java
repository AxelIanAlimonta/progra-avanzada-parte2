import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(4);
		ArrayList<Integer>listaVerticesConectados=new ArrayList<Integer>();
		listaVerticesConectados.add(1);
		listaVerticesConectados.add(4);
		
		grafo.setArista(new Arista(1,2,2));
		grafo.setArista(new Arista(1,3,4));
		grafo.setArista(new Arista(1,4,4));
		grafo.setArista(new Arista(3,2,3));
		grafo.setArista(new Arista(2,4,2));
		grafo.setArista(new Arista(3,4,1));
		
		Grafo resultado=grafo.prim(listaVerticesConectados);
		System.out.println(resultado);
	}
}
