class ContaEspecial extends Conta{
  private double valorChequeEspecial;


  public ContaEspecial(String numeroAgencia, String numeroConta, double saldo){
    super(numeroAgencia, numeroConta, saldo, true);
  }

  public ContaEspecial(String numeroAgencia, String numeroConta, double saldo, double valorChequeEspecial){
    super(numeroAgencia, numeroConta, saldo, true);
    this.valorChequeEspecial = valorChequeEspecial;
  }

  public boolean realizarSaque(double saque){
    if(getSaldo() + getValorChequeEspecial() >= saque){
      double newSaldo = getSaldo() - saque;
      
      setSaldo(newSaldo);
      this.valorChequeEspecial += newSaldo;
      return true;
    }
    System.out.println("Saldo Insuficiente!");
    return false;
  }

  public void imprimirDadosConta(){
    System.out.println("[Agencia]: "+this.getNumeroAgencia() + "\n[Conta]: "+this.getNumeroConta() + "\n[Saldo]: "+this.getSaldo()+ "\n[Saldo Cheque Especial]: "+this.valorChequeEspecial);
  }

  public double getValorChequeEspecial(){
    return this.valorChequeEspecial;
  }

}