package nelsonaguiar.testgft.controller;

import java.util.List;

import nelsonaguiar.testgft.bean.ControladoraRestauranteInterface;
import nelsonaguiar.testgft.bean.Periodo;

public class RestauranteOrdemController {
	
    private ControladoraRestauranteInterface controladora;
	
	public RestauranteOrdemController(Periodo p){
		this.controladora = p.getControladora();
	}
	
	public List<String> retornaPratosOrdenados(String sequencia) {
		return this.controladora.retornaPratosOrdenados(sequencia);
	}
	
	public ControladoraRestauranteInterface getControladora() {
		return this.controladora;
	}

}
