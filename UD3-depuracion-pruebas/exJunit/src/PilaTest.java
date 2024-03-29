import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaTest {

	// Objeto Pila de Personas para cada una delas pruebas.
	Pila<Persona> a19camoan = new Pila<Persona>();

	/* Para todas las pruebas se van a necesitar tres objetos de la clase Persona. Serán los que 
		apilemos/desapilemos de la Pila. Crea los tres objetos Persona con las siguientes características.*/
	Persona personaAnacleto = new Persona("Anacleto", "Montes");
	Persona personaRigoberta = new Persona("Rigoberta", "Bosques");
	Persona personaFlorencio = new Persona("Florencio", "Arenas");

	@Test
	void testTop() {
		// Comprueba que top() inicialmente devuelve null
		assertEquals(a19camoan.top(), null);

		// Apila a Anacleto, Rigoberta y a Florencio.
		try {
			a19camoan.push(personaAnacleto);
			a19camoan.push(personaRigoberta);
			a19camoan.push(personaFlorencio);
		} catch (ElementoNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Comprueba que top() devuelve a Florencio
		assertEquals(a19camoan.top(), personaFlorencio);

		// Comprueba que top() no devuelve null
		assertNotEquals(a19camoan.top(), null);
	}

	@Test
	void testPop() {
		try {
			// Apila a Anacleto
			a19camoan.push(personaAnacleto);

			// Comprueba que pop() devuelve a Anacleto
			assertEquals(a19camoan.pop(), personaAnacleto);

			// Apila a Rigoberta y a Florencio.
			a19camoan.push(personaRigoberta);
			a19camoan.push(personaFlorencio);

			// Comprueba que pop() devuelve a Florencio
			assertEquals(a19camoan.pop(), personaFlorencio);

			// Comprueba que pop() devuelve a Rigoberta
			assertEquals(a19camoan.pop(), personaRigoberta);

			// Comprueba que pop() devuelve null
			assertEquals(a19camoan.pop(), null);
		} catch (ElementoNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testPush() {
		try {
			// Comprueba que top() inicialmente devuelve null
			assertEquals(a19camoan.top(), null);

			// Apila null
			a19camoan.push(null);

			//Comprueba que top() devuelve null
			assertEquals(a19camoan.top(), null);

			// Apila a Anacleto
			a19camoan.push(personaAnacleto);

			//Comprueba que top() devuelve a Anacleto
			assertEquals(a19camoan.top(), personaAnacleto);

			// Apila a Rigoberta
			a19camoan.push(personaRigoberta);

			//Comprueba que top() devuelve a Rigoberta
			assertEquals(a19camoan.top(), personaRigoberta);
		} catch (ElementoNullException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testIsEmpty() {
		try {
			// Comprueba que isEmpty() devuelve true
			assertEquals(a19camoan.IsEmpty(), true);

			// Apila a Anacleto
			a19camoan.push(personaAnacleto);

			// Comprueba que isEmpty() devuelve false
			assertEquals(a19camoan.IsEmpty(), false);

			// Desapila
			a19camoan.pop();

			// Comprueba que isEmpty() devuelve true
			assertEquals(a19camoan.IsEmpty(), true);
		} catch (ElementoNullException e) {
			e.printStackTrace();
		}
	}

}
