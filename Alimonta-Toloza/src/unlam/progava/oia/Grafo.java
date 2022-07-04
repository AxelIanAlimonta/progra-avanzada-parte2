package unlam.progava.oia;

import java.util.PriorityQueue;

public class Grafo {

	private int[][] matAdy;
	private int cantElem=25;
	private int inf=30000;
	protected int resultado;
	

	public Grafo() {
		matAdy = new int[cantElem + 1][cantElem + 1];
		
		for(int i=1;i<=cantElem;i++){
			for(int j=1;j<=cantElem;j++)
				matAdy[i][j]=inf;
		}
		
		for (int i = 1; i <= cantElem; i++) {
			int limj = (i + 6) <= cantElem ? (i + 6) : cantElem;
			for (int j = i + 1; j <= limj; j++)
				matAdy[i][j] = 1;
		}
	}

	public void setEscalera(int nodo1, int nodo2) {
		for (int i = 1; i <= 6; i++) {
			if (nodo1 - i < 1)
				return;
			matAdy[nodo1 - i][nodo1] = 0;
			matAdy[nodo1 - i][nodo2] = 1;
		}
	}

	public void setSerpiente(int nodo1, int nodo2) {
		for (int i = 1; i <= 6; i++) {
			if (nodo2 - i < 1)
				return;
			matAdy[nodo2 - i][nodo2] = 0;
			matAdy[nodo2 - i][nodo1] = 1;
		}
	}

	public void tiradas(){
		PriorityQueue<Nodo>cola=new PriorityQueue<Nodo>();
		Nodo[]costos=new Nodo[cantElem+1];
		boolean[]visitados=new boolean[cantElem+1];
		
		for(int i=1;i<=cantElem;i++){
			costos[i]=new Nodo(1, inf);
		}
		costos[1]=new Nodo(0,0);
		cola.add(new Nodo(1,0));
		
		while(!cola.isEmpty()){
			Nodo actual=cola.poll();
			visitados[actual.id]=true;
			
			for(int i=1;i<=cantElem;i++){
				if(!visitados[i]&&actual.costo+matAdy[actual.id][i]<costos[i].costo){
					costos[i]=new Nodo(actual.id,actual.costo+matAdy[actual.id][i]);
					cola.add(new Nodo(i,actual.costo+matAdy[actual.id][i]));
				}
			}
			
		}
		

		resultado=costos[cantElem].costo;
	}



}
