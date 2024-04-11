package atividade;

public class Contas {

	public static void main(String[] args) {
		ContaPoupança poupança = new ContaPoupança();
		ContaEspecial especial = new ContaEspecial();
		
		especial.setCliente("Marcos");
		especial.setNum_conta(001);
		especial.setSaldo(100.00f);
		especial.setLimite(450.00f);
		
		poupança.setCliente("Ana");
		poupança.setNum_conta(002);
		poupança.setSaldo(600.00f);
		poupança.setDiaDeRendimento(30);
		
		System.out.println(poupança.Sacar(30f));
		System.out.println (especial.Sacar(30f));
		System.out.println (poupança.Sacar(600f));
		System.out.println (especial.Sacar(300f));
		System.out.println (especial.Sacar(300f));
		System.out.println(poupança.Depositar(300f));
		System.out.println(especial.Depositar(100f));
		System.out.println(poupança.calcularNovoSaldo(0.33f));
		
		System.out.println(poupança.toString());
		System.out.println(especial.toString());

	}

}
