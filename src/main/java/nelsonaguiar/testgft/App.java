package nelsonaguiar.testgft;

import java.util.Scanner;

import nelsonaguiar.testgft.bean.Periodo;
import nelsonaguiar.testgft.controller.RestauranteOrdemController;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		System.out.println("Digite o período do dia desejado:\n\nOpções\nMorning ou Night");
    		String periodo = sc.nextLine().toUpperCase();
    		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.valueOf(periodo));
    		System.out.println("Digite a sequencia de pratos desejados separados por vírgulas\n\n1 - Entrée\n2 - Side"
    				+ "\n3 - Drink\n4 - Dessert\n");
    		String pratos = sc.nextLine();
    		System.out.println(ro.retornaPratosOrdenados(pratos));
    	}
    	catch(IllegalArgumentException e) {
    		e.printStackTrace();
    		System.out.println("Período do dia não suportado!!!");
    	}
    	finally {
    		sc.close();
		}
    }
}
