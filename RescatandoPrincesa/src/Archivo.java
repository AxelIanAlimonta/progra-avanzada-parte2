import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public Grafo leer(String pathArchivo) {
		
		File file=null;
		Scanner scan=null;
		Grafo grafo=null;
		
		try {
			file=new File(pathArchivo);
			scan=new Scanner(file);
			
			int cantNodos=scan.nextInt();
			grafo=new Grafo(cantNodos);
			
			int cantAristas=scan.nextInt();
			int cantDragones=scan.nextInt();
			grafo.princesa=scan.nextInt();
			grafo.principe=scan.nextInt();
			
			for(int i=0;i<cantDragones;i++) {
				grafo.posDragones.add(scan.nextInt());
			}
			
			for(int i=0;i<cantAristas;i++) {
				grafo.setArista(scan.nextInt(), scan.nextInt(), scan.nextInt());
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}finally {			
			scan.close();
		}			
		return grafo;
	}
	
	public void escribir(String pathArchivo,Grafo grafo) {
		FileWriter file=null;
		PrintWriter printerWriter=null;
		
		try {
			file=new FileWriter(pathArchivo);
			printerWriter=new PrintWriter(file);
			
			printerWriter.print(grafo.retornarRespuesta());
			
		} catch (Exception e) {
			e.getStackTrace();
		}finally {
			if(file!=null) {
				try {
					file.close();
				} catch (Exception e2) {
					e2.getStackTrace();
				}
			}
		}
	}
	
}
