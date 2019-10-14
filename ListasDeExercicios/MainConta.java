package ListasDeExercicios;
import java.util.Scanner;

	public class MainConta {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta poupanca = new Conta();
		
		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		poupanca.setNome(nome);
		System.out.println("Informe sou numero: ");
		int num = sc.nextInt();
		poupanca.setNumero(num);
		System.out.println("Qual seu saldo: ");
		double saldo = sc.nextDouble();
		poupanca.setSaldo(saldo);
		System.out.println("Valor a ser sacado: ");
		double saque = sc.nextDouble();
		poupanca.setSacar(saque);
		
		
		poupanca.imprimeConta();


	}

}
