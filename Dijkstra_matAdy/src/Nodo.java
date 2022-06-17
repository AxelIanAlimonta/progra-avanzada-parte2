
public class Nodo implements Comparable<Nodo>{

	protected int nodo;
	protected int costo;
	public Nodo(int nodo, int costo) {
		this.nodo = nodo;
		this.costo = costo;
	}
	@Override
	public int compareTo(Nodo o) {
		return this.costo-o.costo;
	}
	@Override
	public String toString() {
		return "(" + nodo + "," + costo + ")";
		
	}
	
	
	
}
