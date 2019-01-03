package nelsonaguiar.testgft.controller;

import java.util.List;

import nelsonaguiar.testgft.bean.ControladoraRestauranteInterface;
import nelsonaguiar.testgft.bean.Periodo;
import nelsonaguiar.testgft.dao.PratoDAO;

public class RestauranteOrdemController {
	
	private PratoDAO pratoDAO;
    private ControladoraRestauranteInterface controladora;
	
	public RestauranteOrdemController(Periodo p){
		this.pratoDAO = new PratoDAO(p);
		this.controladora = p.getControladora();
	}
	
	public List<String> retornaPratosOrdenados(String sequencia) {
		return this.controladora.retornaPratosOrdenados(sequencia);
	}
	

}
