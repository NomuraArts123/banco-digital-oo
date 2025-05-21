
public class Main {

	public static void main(String[] args) {
		Cliente marcos = new Cliente();
		marcos.setNome("Marcos");
		
		Conta contaCorrente = new ContaCorrente(marcos);
		Conta contaPoupanca = new ContaPoupanca(marcos);

		contaCorrente.depositar(100);
		contaCorrente.transferir(100, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
