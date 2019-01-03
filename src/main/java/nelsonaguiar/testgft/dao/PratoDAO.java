package nelsonaguiar.testgft.dao;

import java.util.HashMap;
import java.util.Map;
import nelsonaguiar.testgft.bean.Prato;
import nelsonaguiar.testgft.bean.TipoPrato;

public class PratoDAO {

	private Map<Integer, Prato> pratos;
	private Prato prato;	
	
	public Map<Integer, Prato> loadDataManha() {
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
		
		return this.pratos;
	}
	
	public Map<Integer, Prato> loadDataNoite() {
		this.pratos = new HashMap<Integer, Prato>();

		this.prato = new Prato();
		this.prato.setDescr("steak");
		this.prato.setTipoPrato(TipoPrato.ENTRADA);
		this.pratos.put(this.prato.getTipoPrato().getId(), this.prato);

		this.prato = new Prato();
		this.prato.setDescr("potato");
		this.prato.setTipoPrato(TipoPrato.LADO);
		this.pratos.put(this.prato.getTipoPrato().getId(), this.prato);

		this.prato = new Prato();
		this.prato.setDescr("wine");
		this.prato.setTipoPrato(TipoPrato.BEBIDA);
		this.pratos.put(this.prato.getTipoPrato().getId(), this.prato);
		
		this.prato = new Prato();
		this.prato.setDescr("cake");
		this.prato.setTipoPrato(TipoPrato.SOBREMESA);
		this.pratos.put(this.prato.getTipoPrato().getId(), this.prato);
		
		return this.pratos;
	}



}
