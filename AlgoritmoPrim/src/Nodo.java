
public class Nodo implements Comparable<Nodo>{
	private int id;
	private int peso;
	
	public Nodo(int id,int peso) {
		this.id=id;
		this.peso=peso;
	}

	public int getId() {
		return id;
	}
	
	public int getPeso() {
		return peso;
	}

	public int compareTo(Nodo o) {
		return (this.id-o.id);
	}

	@Override
	public String toString() {
		return "" + id+ ","+peso;
	}
	
	
}
