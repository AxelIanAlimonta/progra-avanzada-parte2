package coloreoDeGrafos_listaAdy;

import java.util.ArrayList;

public class Nodo implements Comparable<Nodo>{
	int id;
	protected int color=0;
	protected int cantAdy=0;	
	protected ArrayList<Integer>listaAdy=new ArrayList<Integer>();
	
	public Nodo(int id) {
		this.id=id;
	}
	
	@Override
	public int compareTo(Nodo o) {
		return o.cantAdy-this.cantAdy;
	}

	@Override
	public String toString() {
		return "(" + id + "," + color + ")";
	}	
	
	

}
