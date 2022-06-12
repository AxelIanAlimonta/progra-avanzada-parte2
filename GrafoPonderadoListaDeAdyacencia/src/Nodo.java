
public class Nodo {
	private int id;
	private int peso;
	
	public Nodo(int id,int peso) {
		this.id=id;
		this.peso=peso;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", peso=" + peso + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public int getPeso() {
		return peso;
	}
	

}
