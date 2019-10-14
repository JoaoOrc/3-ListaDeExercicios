package ListasDeExercicios;

public class Produto {
	private String nomeDoProduto;
	private double precoCusto;
	private double precoVenda;
	private double margemDeLucro;
	///////////////////NOME//////////////////////////////////////	
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	///////////////PRECO DE CUSTO//////////////////////////////	
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	///////////////PRECO DE VENDA////////////////////////////////	
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
		if(getPrecoVenda() < getPrecoCusto()) {
			System.out.println("Você está tendo prejuizo!\n");
			}
	}
	///////////////MARGEM DE LUCRO///////////////////////////////
	public double getMargemDeLucro() {
		return margemDeLucro;
	}
	public void setMargemDeLucro(double margemDeLucro) {
		this.margemDeLucro = margemDeLucro;
	}
	/////////////////////////////////////////////////////////	
	public double calcularMargemLucro() {
		double lucro; 
		lucro = (getPrecoVenda() - getPrecoCusto());
		return lucro;
		
	}
	public String getMargemLucroPorcentagem() {
		return "Margem de lucro percentual: "+((calcularMargemLucro()/getPrecoCusto())*100)+"%";
	}

}
