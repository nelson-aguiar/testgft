package nelsonaguiar.testgft.bean;

public enum TipoPrato {

	ENTRADA(1, "entrée"),
	LADO(2, "side"),
	BEBIDA(3, "drink"),
	SOBREMESA(4, "dessert");
	
	private int id;
	private String descr;
	
	TipoPrato(int id, String descr){
		this.id = id;
		this.descr = descr;
	}

	public int getId() {
		return this.id;
	}

	public String getDescr() {
		return this.descr;
	}

}
