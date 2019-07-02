package prueba1.modulo3.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prueba1.modulo3.modelo.BaseDeDatos;
import prueba1.modulo3.modelo.Dato;

public class BaseDeDatosListarTest {

	private BaseDeDatos bd;

	@Before
	public void setUp() throws Exception {
		this.bd = new BaseDeDatos();
	}

	@Test
	public void cuandoListaEstaVaciaEntoncesTrue() {
		assertTrue(this.bd.listar().size() == 0);
	}

	@Test
	public void cuandoListaTieneUnDatoEntoncesTrue() {
		bd.agregar(new Dato("C1", "DATA C1"));
		assertTrue(this.bd.listar().size() == 1);
	}

	@Test
	public void cuandoListaTiene10DatosEntoncesTrue() {
		bd.agregar(new Dato("C1", "DATA C1"));
		bd.agregar(new Dato("C2", "DATA C2"));
		bd.agregar(new Dato("C3", "DATA C3"));
		bd.agregar(new Dato("C4", "DATA C4"));
		bd.agregar(new Dato("C5", "DATA C5"));
		bd.agregar(new Dato("C6", "DATA C6"));
		bd.agregar(new Dato("C7", "DATA C7"));
		bd.agregar(new Dato("C8", "DATA C8"));
		bd.agregar(new Dato("C9", "DATA C9"));
		bd.agregar(new Dato("C10", "DATA C10"));
		assertTrue(this.bd.listar().size() == 10);
	}

}
