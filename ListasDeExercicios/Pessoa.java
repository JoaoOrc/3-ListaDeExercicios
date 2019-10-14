package ListasDeExercicios;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double calcularIMC() {
		double imc;
		imc=this.peso/(this.altura*this.altura);
		return imc;
	}
	public String imprimirDados() {
		return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nAltura: "+getAltura()+"\nPeso: "+getPeso()+"\nIMC: "+calcularIMC();	}
}

