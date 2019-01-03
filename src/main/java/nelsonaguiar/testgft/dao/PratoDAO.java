package nelsonaguiar.testgft.dao;

import java.util.Map;
import nelsonaguiar.testgft.bean.Periodo;
import nelsonaguiar.testgft.bean.Prato;

public class PratoDAO {

	private Map<Integer, Prato> pratos;

	public PratoDAO(Periodo periodo) {
		this.pratos = periodo.getControladora().loadData();
	}	

}
