package unlam.progava.oia;

public class Nodo implements Comparable<Nodo>{
	protected int id;
	protected int costo;

	public Nodo(int id, int costo) {
		super();
		this.id = id;
		this.costo = costo;
	}

	@Override
	public int compareTo(Nodo o) {
		return this.costo-o.costo;
	}

	@Override
	public String toString() {
		return "(" + id + "," + costo + ")";
	}
	
	

}
