import java.util.*;
abstract class Ordenadores implements AlgoritmoDeOrdenacao {
	List<Number> lista = new ArrayList<>();
	
	abstract ArrayList<Number> retornaListaAleatoria(int qtd, String tipoDaLista);
	public abstract List<Number> ordenaLista(List<Number> lista, int x, int y);
	abstract List<Number> retornaListaQuaseOrdenada(List<Number> lista);
}
