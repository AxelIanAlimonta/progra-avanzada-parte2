package unlam.progava.oia;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Archivo {
	
	public Grafo leer(String pathArchivo){
		
		File file=null;
		Scanner scan=null;
		Grafo grafo=null;
		try {
			file=new File(pathArchivo);
			scan=new Scanner(file);
			
			grafo=new Grafo();
			
			int cantSerpientes=scan.nextInt();
			
			for(int i=0;i<cantSerpientes;i++){
				grafo.setSerpiente(scan.nextInt(), scan.nextInt());
			}
			
			int cantEscaleras=scan.nextInt();
			
			for(int i=0;i<cantEscaleras;i++){
				grafo.setEscalera(scan.nextInt(), scan.nextInt());
			}
			
			
		} catch (Exception e) {
			e.getStackTrace();
		}finally{
			scan.close();
		}
		return grafo;
	}
	
	public void escribir(String path,Grafo grafo){
		FileWriter file=null;
		PrintWriter printerWriter=null;
		
		try {
			file=new FileWriter(path);
			printerWriter=new PrintWriter(file);
			
			printerWriter.print(grafo.resultado);
			
		} catch (Exception e) {
			e.getStackTrace();
		}finally{
			if(file!=null){
				try {
					file.close();
				} catch (Exception e2) {
					e2.getStackTrace();
				}
			}
		}
	}
}
