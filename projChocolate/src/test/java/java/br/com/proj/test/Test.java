package java.br.com.proj.test;

import java.br.com.proj.controller.ChocolateDB;
import java.br.com.proj.model.Chocolate;
import junit.framework.TestCase;

public class Test extends TestCase {

	public void testInsert() {
		Chocolate chocolate = new Chocolate();
		chocolate.setId(1);
		chocolate.setDescricao("Diamante Negro");
		chocolate.setTipo("Barra");
		chocolate.setPorccacau(20);
		assertEquals(new ChocolateDB().insert(chocolate), true);
	}

	public void testUpdate() {
		Chocolate chocolate = new Chocolate();
		chocolate.setId(1);
		chocolate.setDescricao("Ao leite");
		assertEquals(new ChocolateDB().update(chocolate), true);
	}

	public void testDelete() {
		Chocolate chocolate = new Chocolate();
		chocolate.setId(1);
		assertEquals(new ChocolateDB().delete(chocolate), true);
	}

	public void testSelectTo() {
		assertNotNull(new ChocolateDB().selectTo(1));
	}
	
	public void testSelectAll() {
		assertNotNull(new ChocolateDB().selectAll());
	}

}