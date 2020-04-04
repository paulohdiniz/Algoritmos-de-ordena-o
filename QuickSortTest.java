import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class QuickSortTest {
	
	//10^1
	@Test
	void DezUmInteiroAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(10, "int");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(10, "float");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(10, "double");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10, "int", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10, "float", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10, "double", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10, "int", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezUmFloatQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10, "float", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezUmDoubleQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10, "double", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	//10^2
	@Test
	void DezDoisInteiroAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(100, "int");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(100, "float");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(100, "double");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100, "int", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100, "float", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100, "double", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100, "int", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezDoisFloatQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100, "float", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezDoisDoubleQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100, "double", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	//10^3
	@Test
	void DezTresInteiroAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(1000, "int");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(1000, "float");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(1000, "double");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000, "int", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000, "float", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000, "double", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000, "int", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezTresFloatQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000, "float", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezTresDoubleQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000, "double", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	//10^4
	@Test
	void DezQuatroInteiroAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(10000, "int");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(10000, "float");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(10000, "double");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10000, "int", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10000, "float", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10000, "double", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10000, "int", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezQuatroFloatQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10000, "float", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezQuatroDoubleQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(10000, "double", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	//10^5
	@Test
	void DezCincoInteiroAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(100000, "int");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(100000, "float");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(100000, "double");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100000, "int", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100000, "float", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100000, "double", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100000, "int", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezCincoFloatQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100000, "float", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezCincoDoubleQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(100000, "double", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	//10^6
	@Test
	void DezSeisInteiroAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(1000000, "int");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(1000000, "float");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleAleatorio() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaAleatoria(1000000, "double");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000000, "int", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000000, "float", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleReverso() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000000, "double", "decrescente");
		lista3 = listaQuick.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000000, "int", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezSeisFloatQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000000, "float", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
	@Test
	void DezSeisDoubleQuaseOrdenada() {
		QuickSort listaQuick = new QuickSort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = listaQuick.retornaListaOrdenada(1000000, "double", "crescente");
		lista3 = listaQuick.retornaListaQuaseOrdenada(lista2);
		lista4 = listaQuick.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( listaQuick.estaOrdenada(lista4) );
	}
}
