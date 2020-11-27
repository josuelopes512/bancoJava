public class Main {
  public static void main(String[] args) {   
    Cliente cliente = new Cliente("Chico", 2500.0);
    String codigoContaEspecial= "0001";
    ContaEspecial contaEspecial = new ContaEspecial(codigoContaEspecial, "9741", 200, 1500);
    Conta conta = new Conta("1234", "3125", 100, false);
    cliente.abrirConta(conta);
    cliente.abrirConta(contaEspecial);
    //cliente.abrirConta("0001", "1234", 1000, false);
    //cliente.abrirConta("0002", "1277", 500, false);
    cliente.infConta();
    cliente.realizarSaque(codigoContaEspecial, 50.0);
    cliente.infConta();

    //System.out.println("[Agencia] - "+conta.getNumeroAgencia() + "\n[Conta] - "+conta.getNumeroConta());
    //System.out.println("[Agencia] - "+conta_aux.getNumeroAgencia() + "\n[Conta] - "+conta_aux.getNumeroConta());
  }
}