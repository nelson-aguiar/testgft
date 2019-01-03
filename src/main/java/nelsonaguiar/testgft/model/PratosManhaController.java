package nelsonaguiar.testgft.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import nelsonaguiar.testgft.bean.ControladoraRestauranteInterface;
import nelsonaguiar.testgft.bean.Prato;
import nelsonaguiar.testgft.dao.PratoDAO;

public class PratosManhaController implements ControladoraRestauranteInterface {

	private Map<Integer, Prato> pratos;
	
	public PratosManhaController() {
		loadData();
	}

	@Override
	public Map<Integer, Prato> loadData() {
		this.pratos = new PratoDAO().loadDataManha();		
		return this.pratos;
	}

	@Override
	public boolean validaSequenciaPratos(int seq) {
		return this.pratos.containsKey(seq);		
	}

	@Override
	public List<String> retornaPratosOrdenados(String pratos) {		
		List<String> lstPratos = new ArrayList<String>();
		String[] arrPratos = pratos.split(",");
		Arrays.sort(arrPratos);
		for(int i = 0; i < arrPratos.length ; i++) {
			try {
				int aux = Integer.parseInt(arrPratos[i]);
				if(validaSequenciaPratos(aux) && verificaDuplicados(lstPratos, this.pratos.get(aux).getDescr())) {
					lstPratos.add(this.pratos.get(aux).getDescr());				
				}
				else {
					lstPratos.add("erro");
					break;
				}				
			}
			catch (NumberFormatException e) {
				lstPratos.add("erro");
				break;
			}
		}
		return lstPratos;
	}

	@Override
	public boolean verificaDuplicados(List<String> lst, String search) {
		final String permitido = "coffee";
		int count = Collections.frequency(lst, search);
		if(search.equals(permitido)) {
			return true;
		}
		else {
			return count < 1;
		}
	}

}
