
public class Main {
	public static void main(String[] args) {
		Grafo grafo=new Grafo(6);
		grafo.setTunel(1,2);
		grafo.setTunel(2,3);
		grafo.setTunel(4,5);
		grafo.setPuente(1,3);
		grafo.setPuente(4,3);
		grafo.setPuente(4,6);
		grafo.setPuente(5,6);
		
		System.out.println(grafo.cantPuentesNecesarios());
	}
}
