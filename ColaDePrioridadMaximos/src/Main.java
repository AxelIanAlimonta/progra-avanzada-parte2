
public class Main {
	public static void main(String[] args) {
		ColaDePrioridad cola=new ColaDePrioridad();
		
		cola.ponerEnCola(3);
		cola.ponerEnCola(1);
		cola.ponerEnCola(3);
		cola.ponerEnCola(2);
		cola.ponerEnCola(4);
		cola.ponerEnCola(9);
		cola.ponerEnCola(4);
		cola.ponerEnCola(3);
		
		System.out.println(cola.sacarDeCola());
		System.out.println(cola.sacarDeCola());
		System.out.println(cola.sacarDeCola());
		System.out.println(cola.sacarDeCola());
		System.out.println(cola.sacarDeCola());
		System.out.println(cola.sacarDeCola());
		System.out.println(cola.sacarDeCola());
		System.out.println(cola.sacarDeCola());
	}
}