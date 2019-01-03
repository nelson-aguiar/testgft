package nelsonaguiar.testgft.bean;

import java.util.List;
import java.util.Map;

public interface ControladoraRestauranteInterface {
	
	Map<Integer, Prato> loadData();
	boolean validaSequenciaPratos(int seq);
	List<String> retornaPratosOrdenados(String eequencia);
	boolean verificaDuplicados(List<String> lst, String search);
}
