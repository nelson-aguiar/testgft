package nelsonaguiar.testgft;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import nelsonaguiar.testgft.model.PratosManhaController;
import nelsonaguiar.testgft.model.PratosNoiteController;

public class TestApp {
	@Test
	public void testLoadDataManha() {
		PratosManhaController pm = new PratosManhaController();
		assertTrue("Lista Vazia", !pm.loadData().isEmpty());
	}
	@Test
	public void testvalidaSeqManha() {
		PratosManhaController pm = new PratosManhaController();
		assertTrue("Chave não encontrada", pm.loadData().get(1).getDescr() == "eggs");
	}
	
	@Test
	public void testRetornaPratosOrdenadosManha() {
		PratosManhaController pm = new PratosManhaController();
		pm.loadData();
		assertTrue("Pratos Não encontrados", !pm.retornaPratosOrdenados("1,2,3").isEmpty());
	}
	
	@Test
	public void testLoadDataNoite() {
		PratosNoiteController pn = new PratosNoiteController();
		assertTrue("Lista Vazia", !pn.loadData().isEmpty());
	}
	@Test
	public void testvalidaSeqNoite() {
		PratosNoiteController pn = new PratosNoiteController();
		assertTrue("Chave não encontrada", pn.loadData().get(1).getDescr() == "steak");
	}
	
	@Test
	public void testRetornaPratosOrdenadosNoite() {
		PratosNoiteController pn = new PratosNoiteController();
		pn.loadData();
		assertTrue("Pratos Não encontrados", !pn.retornaPratosOrdenados("1,2,3").isEmpty());
	}
}
