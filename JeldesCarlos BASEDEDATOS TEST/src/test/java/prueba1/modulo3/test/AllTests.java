package prueba1.modulo3.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BaseDeDatosAgregarTest.class, BaseDeDatosEliminarTest.class, BaseDeDatosListarTest.class,
		BaseDeDatosModificarTest.class })
public class AllTests {

}
