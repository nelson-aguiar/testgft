package nelsonaguiar.testgft.bean;

import nelsonaguiar.testgft.model.PratosManhaController;
import nelsonaguiar.testgft.model.PratosNoiteController;

public enum Periodo {

	MORNING("morning", new PratosManhaController()),
	NIGHT("night", new PratosNoiteController());
	
	private String descr;
	private ControladoraRestauranteInterface pratosController;
	
	Periodo(String descr, ControladoraRestauranteInterface pratosController){
		this.descr = descr;
		this.pratosController = pratosController;
	}
	
	public String getDescr() {
		return this.descr;
	}
	
	public ControladoraRestauranteInterface getControladora() {
		return this.pratosController;
	}
}
