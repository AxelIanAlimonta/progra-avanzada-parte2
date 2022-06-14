import java.util.ArrayList;
import java.util.Stack;

public class Grafo {

	private int cantNodos;
	private int matAdy[][];
	private boolean vecVisitados[];
	private ArrayList<Integer>resultado;
	private Stack<Integer>pila;
	
	public Grafo(int cantNodos) {
		this.cantNodos=cantNodos;
		matAdy=new int[cantNodos+1][cantNodos+1];
	}
	
	public void setArista(int nodo1,int nodo2) {
		matAdy[nodo1][nodo2]=1;
		matAdy[nodo2][nodo1]=1;
	}
	
	public String DFS(int nodoInicial) {
		vecVisitados=new boolean[cantNodos+1];
		resultado=new ArrayList<Integer>();
		pila=new Stack<Integer>();
		
		pila.push(nodoInicial);
		resultado.add(nodoInicial);
		vecVisitados[nodoInicial]=true;
		
		while(resultado.size()!=cantNodos) {
			int nodoActual=pila.pop();
			for(int i=1;i<=cantNodos;i++) {
				if(!vecVisitados[i]&&matAdy[nodoActual][i]==1) {
					pila.push(i);
					resultado.add(i);
					vecVisitados[i]=true;
				}
			}
		}
		return mostrarResultado();
	}
	
	public String mostrarResultado() {
		String sal="";
		
		for(int nro:resultado) {
			sal+=nro+" ";
		}
		return sal;
	}
}
