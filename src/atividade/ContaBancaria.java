package atividade;

public class ContaBancaria {
	
	public String cliente;
	public int num_conta;
	public float saldo;
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
	public String Sacar(float valor){
		if (valor > saldo)
			return "Saldo insuficiente\n";
		saldo = saldo - valor;
		return "Saque efetuado com sucesso!\n"
				+ "Saldo atual: " + saldo + "\n";
	}
	
	public String Depositar (float valor) {
		if (valor <= 0)
			return "Valor de depósito inválido\n";
		saldo = saldo + valor;
		return "Depósito realizado com sucesso!\n"
				+ "Salado atual: " + saldo + "\n";
	}
	
	@Override
	public String toString() {
		return "Cliente: " + this.cliente + "\nNumero da conta: " + this.num_conta +
				"\nSaldo: " + this.saldo + "\n";
	}

}
