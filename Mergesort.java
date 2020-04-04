import java.util.*;

 class Mergesort extends Ordenadores {

	public static void main(String[] args) {
		Mergesort listaMerge = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		lista2 = listaMerge.retornaListaAleatoria(3, "int");
		System.out.println(lista2);
		System.out.println(listaMerge.ordenaLista(lista2, 0, lista2.size() -1));
	}
	
	 void merge(List<Number> lista, int l, int m, int r) 
	    { 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	        Number L[] = new Number [n1]; 
	        Number R[] = new Number [n2]; 
	        for (int i=0; i<n1; ++i) 
	            L[i] = lista.get(l + i); 
	        for (int j=0; j<n2; ++j) 
	            R[j] = lista.get(m + 1+ j); 	
	        int i = 0, j = 0; 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i].doubleValue() <= R[j].doubleValue()) 
	            { 
	            	lista.set(k, L[i]);
	                i++; 
	            } 
	            else
	            { 
	            	lista.set(k, R[j]);
	                j++; 
	            } 
	            k++; 
	        } 
	        while (i < n1) 
	        { 
	        	lista.set(k, L[i]);
	            i++; 
	            k++; 
	        } 
	        while (j < n2) 
	        { 
	        	lista.set(k, R[j]);
	            j++; 
	            k++; 
	        }
	    } 
	 	@Override
	 	public List<Number> ordenaLista(List<Number> lista, int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            int m = (l+r)/2; 
	            ordenaLista(lista, l, m); 
	            ordenaLista(lista , m+1, r); 
	            merge(lista, l, m, r); 
	        }
	      //  System.out.println("merge"); linha para verificar se esta executando realmente o merge
	        return lista;
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
