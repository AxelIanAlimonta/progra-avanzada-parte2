
public class Main {
	
	protected Grafo grafo=null;
	private Archivo archivo=new Archivo();

	public static void main(String[] args) {
		Main ejercicio=new Main();
		
		ejercicio.leerArchivo("src/in/00.in");
		ejercicio.resolver();
		ejercicio.escribirArchivo("src/out/00.out");
	}
	
	private void leerArchivo(String pathArchivo) {
		grafo=archivo.leer(pathArchivo);
	}
	
	private void resolver() {
		grafo.Dijkstra();
	}
	
	private void escribirArchivo(String pathArchivo) {
		archivo.escribir(pathArchivo, grafo);
	}
}
