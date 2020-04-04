import java.util.*;
 class Heapsort extends Ordenadores {

	public static void main(String[] args) {
		Heapsort listaHeap = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		lista2 = listaHeap.retornaListaAleatoria(2, "float");
		System.out.println(lista2);
		System.out.println(listaHeap.ordenaLista(lista2, 0 ,lista2.size() -1));
	}
	//ordenação do tipo heapsort
	 @Override
	public List<Number> ordenaLista(List<Number> lista, int x, int y){
		int n = lista.size();
		 for (int i = n/2 - 1; i >= 0; i--) {
			 heapify(lista, n, i); 
		 }
		 for (int i=n-1; i>=0; i--) 
	        {
	            Number temp = lista.get(0); 
	            lista.set(0,lista.get(i));
	            lista.set(i, temp);
	            heapify(lista, i, 0); 
	        }
		// System.out.println("heap"); linha para verificar se esta executando realmente o heap
		 return lista;
	}
	//função auxiliar para o heapsort
	void heapify(List<Number> lista, int n, int i) 
    { 
        int largest = i;  
        int l = 2*i + 1; 
        int r = 2*i + 2;  
        if (l < n && lista.get(l).doubleValue() > lista.get(largest).doubleValue()) 
            largest = l; 
        if (r < n && lista.get(r).doubleValue() > lista.get(largest).doubleValue()) 
            largest = r; 
        if (largest != i) 
        { 
            Number swap = lista.get(i);
            lista.set(i, lista.get(largest));
            lista.set(largest, swap);
            heapify(lista, n, largest); 
        } 
    }
	//O método abaixo cria uma lista com qtd elementos aleatorios e um tipo especifico.
	ArrayList<Number> retornaListaAleatoria(int qtd, String tipoDaLista){
		ArrayList<Number> numbers = new ArrayList<>();
		Random rd = new Random();
		if(tipoDaLista.toLowerCase().equals("int") ) {
			for (int i = 0; i < qtd; i++) {
				numbers.add(rd.nextInt());
			}
		}
		if(tipoDaLista.toLowerCase().equals("float")) {
			for (int i = 0; i < qtd; i++) {
				numbers.add(rd.nextFloat());
			}
		}
		if(tipoDaLista.toLowerCase().equals("double")) {
			for (int i = 0; i < qtd; i++) {
				numbers.add(rd.nextDouble());
			}
		}
		return numbers;
	}
	//O método abaixo cria uma lista com qtd elementos ordenados em um tipo especifico e numa ordem (crescente ou decrescente)
	ArrayList<Number> retornaListaOrdenada(int qtd, String tipoDaLista, String ordem){
		ArrayList<Number> numbers = new ArrayList<>();
		if(tipoDaLista.toLowerCase().equals("int") && ordem.toLowerCase().equals("crescente")) {
			for (int i = 0; i < qtd; i++) {
				numbers.add(i);
			}
		}
		if(tipoDaLista.toLowerCase().equals("int") && ordem.toLowerCase().equals("decrescente")) {
			for (int i = qtd; i > 0; i--) {
				numbers.add(i);
			}
		}
		if(tipoDaLista.toLowerCase().equals("float") && ordem.toLowerCase().equals("crescente")) {
			for (int i = 0; i < qtd; i++) {
				numbers.add((float)i);
			}
		}
		if(tipoDaLista.toLowerCase().equals("float") && ordem.toLowerCase().equals("decrescente")) {
			for (int i = qtd; i  >0; i--) {
				numbers.add((float)i);
			}
		}
		if(tipoDaLista.toLowerCase().equals("double") && ordem.toLowerCase().equals("crescente")) {
			for (int i = 0; i < qtd; i++) {
				numbers.add((double)i);
			}
		}
		if(tipoDaLista.toLowerCase().equals("double") && ordem.toLowerCase().equals("decrescente")) {
			for (int i = qtd; i > 0; i--) {
				numbers.add((double)i);
			}
		}
		return numbers;
	}
	List<Number> retornaListaQuaseOrdenada(List<Number> lista){
		//20% dos elementos estarão fora da ordem
		for (int i = 0; i < lista.size()/10; i++) {
			 	Number temp = lista.get(i);
                lista.set(i, lista.get( lista.size() -1 - i ));
                lista.set(lista.size()-1 -i, temp);
		}
		return lista;
	}
	boolean estaOrdenada(List<Number> lista) {
		for (int i = 0; i < lista.size(); i++) {
				if( i != (lista.size() -1) ) {
					if(lista.get(i).doubleValue() > lista.get(i+1).doubleValue()) {
						return false;
					}
				}
			}
		return true;
	}
}
