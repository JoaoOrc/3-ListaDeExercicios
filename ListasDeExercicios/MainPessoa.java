package ListasDeExercicios;

public class MainPessoa {

	public static void main(String[] args) {
		Pessoa pessoinha = new Pessoa();
		
		pessoinha.setNome("Jo�o Vinicius...");
		pessoinha.setIdade(21);
		pessoinha.setAltura(1.98);
		pessoinha.setPeso(94.6);
		
		System.out.println(pessoinha.imprimirDados());

	}

}
