package testGrafos;

public class Grafo {

	int[][]matrizDeAdyacencia;
	int cantNodos;
	
	public Grafo(int cantNodos) {
		this.cantNodos=cantNodos;
		matrizDeAdyacencia=new int[cantNodos+1][cantNodos+1];
	}
	
	public void setArista(int nodo1,int nodo2) {
		matrizDeAdyacencia[nodo1][nodo2]=1;
		matrizDeAdyacencia[nodo2][nodo1]=1;		
	}
	
	public boolean existeArista(int nodo1,int nodo2) {
		if(matrizDeAdyacencia[nodo1][nodo2]==1)
			return true;
		else
			return false;
	}
	
	public void mostrarGrafo() {
		for(int i=1;i<=cantNodos;i++) {
			for(int j=1;j<=cantNodos;j++)
				System.out.print(matrizDeAdyacencia[i][j]+" ");
			System.out.println();
		}				
	}
	
	
	
	@Override
	public String toString() {
		String sal="";
		for(int i=1;i<=cantNodos;i++) {
			for(int j=1;j<=cantNodos;j++)
				sal+=(matrizDeAdyacencia[i][j]+" ");
			sal+="\n";
		}
		return sal;
	}
	
}
