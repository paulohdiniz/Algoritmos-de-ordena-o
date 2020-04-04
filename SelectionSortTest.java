import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
	@Test
	void DezUmInteiroAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "int", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezUmFloatQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "float", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezUmDoubleQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	//10^2
	@Test
	void DezDoisInteiroAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "int", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezDoisFloatQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "float", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezDoisDoubleQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	//10^3
	@Test
	void DezTresInteiroAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "int", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezTresFloatQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "float", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezTresDoubleQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	//10^4
	@Test
	void DezQuatroInteiroAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "int", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezQuatroFloatQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "float", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezQuatroDoubleQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	//10^5
	@Test
	void DezCincoInteiroAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "int", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezCincoFloatQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "float", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezCincoDoubleQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	//10^6
	@Test
	void DezSeisInteiroAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleAleatorio() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleReverso() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "int", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezSeisFloatQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "float", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
	@Test
	void DezSeisDoubleQuaseOrdenada() {
		SelectionSort lista = new SelectionSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
}
