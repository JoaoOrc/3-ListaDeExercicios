package ListasDeExercicios;

public class Conta {
private int numero;
private String nome;
public double saldo;
public double valor;

public void Conta(String nome,int numero, double saldo){
	
}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}


public boolean setSacar(double valor){
	if((valor) <= (this.getSaldo()))
		return true ;
	else
		return false;
	
}
public double getSacar(double valor){
	return this.valor=valor;
}



public void deposita(double valor){
	
}

public boolean transferir(Conta destino, double valor){
	return true;
}

public void imprimeConta(){
	System.out.println("Nome: "+getNome()+"\nSaldo: "+(getSaldo()-getSacar(valor)));
}

















}
