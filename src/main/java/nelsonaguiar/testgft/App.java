package nelsonaguiar.testgft;

import java.util.Scanner;

import nelsonaguiar.testgft.bean.Periodo;
import nelsonaguiar.testgft.controller.RestauranteOrdemController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		System.out.println("Digite o período do dia desejado:\n\nOpções\nMorning ou Night");
    		Scanner sc = new Scanner(System.in);
    		String periodo = sc.nextLine().toUpperCase();
    		RestauranteOrdemController ro = new RestauranteOrdemController(Periodo.valueOf(periodo));
    		System.out.println("Digite a sequencia de pratos desejados separados por vírgulas\n\n1 - Entrée\n2 - Side"
    				+ "\n3 - Drink\n4 - Dessert\n");
    		String pratos = sc.nextLine();
    		System.out.println(pratos);
    		System.out.println(ro.retornaPratosOrdenados(pratos));
    	}
    	catch(IllegalArgumentException e) {
    		System.out.println("Período do dia não suportado!!!");
    	}
    	
    }
}
