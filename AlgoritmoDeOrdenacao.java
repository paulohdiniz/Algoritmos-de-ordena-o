import java.util.*;
public interface AlgoritmoDeOrdenacao {
	
	// nlogn => Mergesort , heapsort
	//n^2 => Selection Sort, quick
	List<Number> ordenaLista(List<Number> lista, int x, int y);
     
}
