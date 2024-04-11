package atividade;

public class ContaPoupança extends ContaBancaria{
	int diaDeRendimento;
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	public String calcularNovoSaldo (float taxa) {
		saldo = saldo + (saldo * (taxa * diaDeRendimento)/1000);
		return "Saldo atualizado: " + saldo +"\n";
	}
}
