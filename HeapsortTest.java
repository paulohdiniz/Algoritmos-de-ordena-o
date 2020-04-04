import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class HeapsortTest {

	@Test
	void DezUmInteiroAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroQuaseOrdenada() {
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroQuaseOrdenada() {
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroQuaseOrdenada() {
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroQuaseOrdenada() {
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroQuaseOrdenada() {
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleAleatorio() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleReverso() {
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroQuaseOrdenada() {
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
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
		Heapsort lista = new Heapsort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}
}
