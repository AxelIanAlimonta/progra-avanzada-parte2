import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
	private int cantNodos;
	private int matAdy[][];
	private boolean vecVisitados[];
	private ArrayList<Integer>resultadoBFS;
	private Queue<Integer>colaBFS;
	
	
	public Grafo(int cantNodos) {
		this.cantNodos=cantNodos;
		matAdy=new int[cantNodos+1][cantNodos+1];
	}
	
	public void insertarArista(int nodo1,int nodo2) {
		matAdy[nodo1][nodo2]=1;
		matAdy[nodo2][nodo1]=1;
	}
	
	public String BFS(int nodoInicial) {
		vecVisitados=new boolean[cantNodos+1];
		resultadoBFS=new ArrayList<Integer>();
		colaBFS=new LinkedList<Integer>();
		
		colaBFS.add(nodoInicial);
		resultadoBFS.add(nodoInicial);
		vecVisitados[nodoInicial]=true;
		
		while(resultadoBFS.size()!=cantNodos) {
			int nodoActual=colaBFS.poll();
			for(int i=1;i<=cantNodos;i++) {
				if(!vecVisitados[i]&&matAdy[nodoActual][i]==1) {
					colaBFS.add(i);
					vecVisitados[i]=true;
					resultadoBFS.add(i);
				}
			}
		}
		return resultadoString();
	}
	
	public String resultadoString() {
		String sal="";
		for(int nro:resultadoBFS) {
			sal+=nro+" ";
		}
		return sal;
	}
	 
}
