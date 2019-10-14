package ListasDeExercicios;

import java.util.Scanner;

public class MainProduto {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		Produto novoProduto = new Produto();
		
		System.out.println("Informe nome do produto:\n");
		novoProduto.setNomeDoProduto(sc.next());
		
		System.out.println("Informe o custo do produto:\n");
		novoProduto.setPrecoCusto(sc.nextDouble());
		
		System.out.println("Informe o valor de revenda do produto:\n");
		novoProduto.setPrecoVenda(sc.nextDouble());
		
		System.out.println("Margem de lucro: "+novoProduto.calcularMargemLucro());
		
		System.out.println(novoProduto.getMargemLucroPorcentagem());
		
	}

}
