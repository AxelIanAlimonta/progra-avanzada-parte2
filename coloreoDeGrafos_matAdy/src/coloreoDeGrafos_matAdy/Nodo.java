package coloreoDeGrafos_matAdy;

public class Nodo implements Comparable<Nodo>{
	protected int id;
	protected int nivel;

	public Nodo(int id, int nivel) {
		this.id = id;
		this.nivel = nivel;
	}

	@Override
	public int compareTo(Nodo o) {
		return this.nivel-o.nivel;
	}

}
