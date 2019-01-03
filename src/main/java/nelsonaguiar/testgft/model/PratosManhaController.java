package nelsonaguiar.testgft.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nelsonaguiar.testgft.bean.ControladoraRestauranteInterface;
import nelsonaguiar.testgft.bean.Prato;
import nelsonaguiar.testgft.bean.TipoPrato;

public class PratosManhaController implements ControladoraRestauranteInterface {

	private Prato prato;
	private HashMap<Integer, Prato> pratos;

	@Override
	public Map<Integer, Prato> loadData() {
		this.pratos = new HashMap<Integer, Prato>();

		this.prato = new Prato();
		this.prato.setDescr("eggs");
		this.prato.setTipoPrato(TipoPrato.ENTRADA);
		this.pratos.put(this.prato.getTipoPrato().getId(), this.prato);

		this.prato = new Prato();
		this.prato.setDescr("toast");
		this.prato.setTipoPrato(TipoPrato.LADO);
		this.pratos.put(this.prato.getTipoPrato().getId(), this.prato);

		this.prato = new Prato();
		this.prato.setDescr("coffee");
		this.prato.setTipoPrato(TipoPrato.BEBIDA);
		this.pratos.put(this.prato.getTipoPrato().getId(), this.prato);
		
		return pratos;
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
			int aux = Integer.parseInt(arrPratos[i]);
			if(validaSequenciaPratos(aux) && verificaDuplicados(lstPratos, this.pratos.get(aux).getDescr())) {
				lstPratos.add(this.pratos.get(aux).getDescr());				
			}
			else {
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