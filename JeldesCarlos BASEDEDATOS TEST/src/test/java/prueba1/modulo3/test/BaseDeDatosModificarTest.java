package prueba1.modulo3.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prueba1.modulo3.modelo.BaseDeDatos;
import prueba1.modulo3.modelo.Dato;


public class BaseDeDatosModificarTest {

	private BaseDeDatos bd;

	@Before
	public void setUp() throws Exception {
		this.bd = new BaseDeDatos();
	}

	@Test
	public void cuandoModifico1ExistenteEntoncesTrue() {
		bd.agregar(new Dato("C1", "DATA C1"));
		boolean retorno = this.bd.modificar(new Dato("C1", "DATA C1 TEST MODIFICADO"));
		assertTrue(retorno);
	}

	@Test
	public void cuandoModifico1NoExistenteEntoncesFalse() {
		boolean retorno = this.bd.modificar(new Dato("C1", "DATA C1 TEST MODIFICADO"));
		assertFalse(retorno);
	}

}
