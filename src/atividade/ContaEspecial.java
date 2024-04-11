package atividade;

public class ContaEspecial extends ContaBancaria {
	
	float limite;
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public String Sacar(float valor){
		if (valor > (saldo + limite))
			return "Saldo insuficiente\n";
		saldo = saldo - valor;
		return "Saque efetuado com sucesso!\n"
				+ "Saldo atual: " + saldo + "\n";
	}
	
}
