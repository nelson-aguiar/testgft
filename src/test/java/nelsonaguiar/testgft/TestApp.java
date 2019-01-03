package nelsonaguiar.testgft;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import nelsonaguiar.testgft.bean.Periodo;
import nelsonaguiar.testgft.controller.RestauranteOrdemController;
import nelsonaguiar.testgft.model.PratosManhaController;
import nelsonaguiar.testgft.model.PratosNoiteController;

public class TestApp {
	@Test
	public void testLoadDataManha() {
		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.MORNING);
		assertTrue("Lista Vazia", !ro.getControladora().loadData().isEmpty());
	}
	@Test
	public void testvalidaSeqManha() {
		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.MORNING);
		assertTrue("Chave não encontrada", ro.getControladora().loadData().get(1).getDescr() == "eggs");
	}
	
	@Test
	public void testRetornaPratosOrdenadosManha() {
		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.MORNING);
		ro.getControladora().loadData();
		assertTrue("Pratos Não encontrados", !ro.retornaPratosOrdenados("1,2,3").isEmpty());
	}
	
	@Test
	public void testLoadDataNoite() {
		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.NIGHT);
		assertTrue("Lista Vazia", !ro.getControladora().loadData().isEmpty());
	}
	@Test
	public void testvalidaSeqNoite() {
		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.NIGHT);;
		assertTrue("Chave não encontrada", ro.getControladora().loadData().get(1).getDescr() == "steak");
	}
	
	@Test
	public void testRetornaPratosOrdenadosNoite() {
		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.NIGHT);
		ro.getControladora().loadData();
		assertTrue("Pratos Não encontrados", !ro.retornaPratosOrdenados("1,2,3").isEmpty());
	}
}
