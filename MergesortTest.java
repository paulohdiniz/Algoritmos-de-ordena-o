import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class MergesortTest {

	@Test
	void DezUmInteiroAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmFloatReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmDoubleReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezUmInteiroQuaseOrdenada() {
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisFloatReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisDoubleReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezDoisInteiroQuaseOrdenada() {
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresFloatReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresDoubleReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezTresInteiroQuaseOrdenada() {
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(10000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroFloatReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroDoubleReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(10000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezQuatroInteiroQuaseOrdenada() {
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(100000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoFloatReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoDoubleReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(100000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezCincoInteiroQuaseOrdenada() {
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "int");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "float");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleAleatorio() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaAleatoria(1000000, "double");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "int", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisFloatReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "float", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisDoubleReverso() {
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "double", "decrescente");
		lista3 = lista.ordenaLista(lista2, 0 , lista2.size() -1);
		assertTrue( lista.estaOrdenada(lista3) );
	}
	@Test
	void DezSeisInteiroQuaseOrdenada() {
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
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
		Mergesort lista = new Mergesort();
		List <Number> lista2= new ArrayList<>();
		List <Number> lista3= new ArrayList<>();
		List <Number> lista4= new ArrayList<>();
		lista2 = lista.retornaListaOrdenada(1000000, "double", "crescente");
		lista3 = lista.retornaListaQuaseOrdenada(lista2);
		lista4 = lista.ordenaLista(lista3, 0 , lista3.size() -1);
		assertTrue( lista.estaOrdenada(lista4) );
	}

}
