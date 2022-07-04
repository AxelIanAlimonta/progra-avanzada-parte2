package unlam.progava.oia;

public class EjercicioOIA {

	Grafo grafo;
	Archivo archivo=new Archivo();
	public static void main(String[] args) {
		EjercicioOIA ejercicio = new EjercicioOIA();		
		
		
		ejercicio.leer("src/unlam/progava/oia/in/00.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/00.out");
	}


	public void leer(String path) {
		grafo=archivo.leer(path);
	}
	

	public void escribir(String path) {
		archivo.escribir(path, grafo);
	}
	

	public void resolver() {
		grafo.tiradas();
	}
}
