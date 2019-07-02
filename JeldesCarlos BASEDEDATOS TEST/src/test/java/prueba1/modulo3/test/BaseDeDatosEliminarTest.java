package prueba1.modulo3.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prueba1.modulo3.modelo.BaseDeDatos;
import prueba1.modulo3.modelo.Dato;


public class BaseDeDatosEliminarTest {

	private BaseDeDatos bd;

	@Before
	public void setUp() throws Exception {
		this.bd = new BaseDeDatos();
	}
	@Test
	public void cuandoElimina1NoExistenteretornaFalse() {		
		assertFalse(this.bd.eliminar("F1"));
	}
	
	@Test
	public void cuandoElimina1ExistenteretornaTrue() {	
		bd.agregar(new Dato("C1", "DATA C1"));		
		assertTrue(this.bd.eliminar("C1"));
	}
	


}
