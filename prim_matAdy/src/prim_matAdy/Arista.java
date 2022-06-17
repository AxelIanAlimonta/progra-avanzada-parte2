package prim_matAdy;

public class Arista {
	protected int nodo1;
	protected int nodo2;
	protected int peso;
	
	public Arista(int nodo1, int nodo2, int peso) {
		super();
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return  nodo1 + " " + nodo2 + " " + peso;
	}	
	
	
}
