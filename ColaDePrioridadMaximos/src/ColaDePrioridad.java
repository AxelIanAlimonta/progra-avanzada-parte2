import java.util.ArrayList;
import java.util.Collections;

public class ColaDePrioridad {

	private ArrayList<Integer> elementos = new ArrayList<Integer>();

	public void ponerEnCola(Integer nro) {
		elementos.add(nro);
		subirNodo(elementos.size() - 1);
	}

	private void subirNodo(int nodoIdx) {
		boolean seguirSubiendo = true;
		while (seguirSubiendo) {
			if (nodoIdx == 0)
				return;
			int idxDePadre = (nodoIdx - 1) / 2;
			if (elementos.get(idxDePadre) < elementos.get(nodoIdx)) {
				Collections.swap(elementos, nodoIdx, idxDePadre);
				nodoIdx = idxDePadre;
			} else
				seguirSubiendo = false;
		}
	}

	public Integer sacarDeCola() {

		if (elementos.size() == 0)
			return null;
		Integer retorno = elementos.get(0);

		Collections.swap(elementos, 0, elementos.size() - 1);
		elementos.remove(elementos.size() - 1);

		bajarNodo(0);

		return retorno;
	}

	private void bajarNodo(int idxNodo) {
		boolean seguirBajando = true;

		while (seguirBajando) {

			int idxHijoIzq = 2 * idxNodo + 1;
			int idxHijoDer = 2 * idxNodo + 2;
			boolean menorQueHijoIzq = false;
			boolean menorQueHijoDer = false;

			if (idxHijoIzq <= elementos.size() - 1 && elementos.get(idxNodo) < elementos.get(idxHijoIzq))
				menorQueHijoIzq = true;
			if (idxHijoDer <= elementos.size() - 1 && elementos.get(idxNodo) < elementos.get(idxHijoDer))
				menorQueHijoDer = true;
			if (menorQueHijoDer && menorQueHijoIzq) {
				if (elementos.get(idxHijoIzq) > elementos.get(idxHijoDer)) {
					Collections.swap(elementos, idxNodo, idxHijoIzq);
					idxNodo = idxHijoIzq;
				} else {
					Collections.swap(elementos, idxNodo, idxHijoDer);
					idxNodo = idxHijoDer;
				}
			} else if (menorQueHijoDer && !menorQueHijoIzq) {
				Collections.swap(elementos, idxNodo, idxHijoDer);
				idxNodo = idxHijoDer;
			} else if (!menorQueHijoDer && menorQueHijoIzq) {
				Collections.swap(elementos, idxNodo, idxHijoIzq);
			} else {
				seguirBajando = false;
			}
		}
	}
}
