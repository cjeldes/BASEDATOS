package prueba1.modulo3.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import prueba1.modulo3.modelo.BaseDeDatos;
import prueba1.modulo3.modelo.Dato;

public class BaseDeDatosAgregarTest {

	private BaseDeDatos bd;

	@Before
	public void setUp() throws Exception {
		this.bd = new BaseDeDatos();
	}

	@Test
	public void cuandoAgrego1EntoncesTrue() {
		assertTrue(this.bd.agregar(new Dato("A1", "DATOS A1 TEST")));
	}

	@Test
	public void cuandoAgrego1SinIDEntoncesFalse() {
		assertFalse(this.bd.agregar(new Dato(null, "DATOS A1 TEST")));
	}

	@Test
	public void cuandoAgrego1conIDMenora1EntoncesFalse() {
		assertFalse(this.bd.agregar(new Dato("", "DATOS A1 TEST")));
	}

	@Test
	public void cuandoAgrego1SinIDniDATAEntoncesFalse() {
		assertFalse(this.bd.agregar(new Dato(null, null)));
	}

}
