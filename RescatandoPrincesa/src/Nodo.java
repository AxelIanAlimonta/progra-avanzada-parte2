
public class Nodo implements Comparable<Nodo>{
	protected int id;
	protected int peso;

	public Nodo(int id, int peso) {
		this.id = id;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "(" + id + "," + peso + ")";
	}

	@Override
	public int compareTo(Nodo o) {
		return this.peso-o.peso;
	}
	
	
}
