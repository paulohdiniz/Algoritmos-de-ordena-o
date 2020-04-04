import java.util.*;
 class QuickSort extends Ordenadores	{

	public static void main(String[] args) {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10, "int", "crescente");
		//lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		System.out.println(lista2);
		System.out.println(listaQuick.estaOrdenada(lista2));
		//System.out.println(listaQuick.ordenaLista(lista2, 0 , lista2.size() -1));
	}
	 int partition(List<Number> lista, int low, int high) 
	    { 
	        Number pivot = lista.get(high);  
	        int i = (low-1);
	        for (int j=low; j<high; j++) 
	        { 
	            if (lista.get(j).doubleValue() < pivot.doubleValue()) 
	            { 
	                i++; 
	                Number temp = lista.get(i);
	                lista.set(i, lista.get(j));
	                lista.set(j, temp);
	            } 
	        } 
	        Number temp = lista.get(i+1);
	        lista.set(i+1, lista.get(high));
	        lista.set(high, temp);
	        return i+1; 
	    }
	 @Override
	 public List<Number> ordenaLista(List<Number> lista, int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            int pi = partition(lista, low, high); 
	            ordenaLista(lista, low, pi-1); 
	            ordenaLista(lista, pi+1, high); 
	        }
	    //    System.out.println("quick"); linha para verificar se esta executando realmente o quick
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
