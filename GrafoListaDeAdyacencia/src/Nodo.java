
public class Nodo {
	int id;
	int peso;
	
	public Nodo(int id,int peso) {
		this.id=id;
		this.peso=peso;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", peso=" + peso + "]";
	}
	
	
	
}
