import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Conta{
  private String numeroAgencia;
  private String numeroConta;
  protected double saldo;
  protected double vlEmprestimo;
  private List<Transacao> transacoes = new ArrayList<Transacao>();
  private HashMap<String, Double>  transacoesMap = new HashMap<String, Double>();
  private boolean flagIsencao;

  public Conta(){}
  
  public Conta(String numeroAgencia, String numeroConta, double saldo){
    this.numeroConta = numeroConta; 
    this.numeroAgencia = numeroAgencia;
    this.saldo = saldo;
  }

  public Conta(String numeroAgencia, String numeroConta, double saldo, boolean flagIsencao){
    this.numeroConta = numeroConta;
    this.numeroAgencia = numeroAgencia;
    this.saldo = saldo;
    this.flagIsencao = flagIsencao;
  }

  public boolean realizarSaque(double saque){
    if(this.saldo >= saque){
      this.saldo -= saque;
      return true;
    }
    transacoes.add(new Transacao(saque, TipoTransacao.SAQUE));
    System.out.println("Saldo Insuficiente!");
    return false;
  }
  public void realizarTransacao(String tipo, Double valor){
    if (tipo.equalsIgnoreCase("EMPRESTIMO")) {
      this.saldo += valor;
      this.vlEmprestimo += valor;
    }
    else if (tipo.equalsIgnoreCase("DEPOSITO")) {
      this.saldo += valor;
    }
    else if (tipo.equalsIgnoreCase("TRANSFERENCIA")) {
      this.saldo += valor;
    }
    transacoesMap.put(tipo, valor);
  }

  public void realizarTransacao(Transacao transacao) {
    /*if (transacao.getTipoTransacao() == TipoTransacao.DEPOSITO) {
      this.saldo += transacao.getValor();
    }
    else if(transacao.getTipoTransacao() == TipoTransacao.TRANSFERENCIA){
      this.saldo += transacao.getValor();
    }
    else if(transacao.getTipoTransacao() == TipoTransacao.EMPRESTIMO){
      this.saldo -= transacao.getValor();
    }

    transacoes.add(transacao);*/
  }

  public List<Transacao> pesqUltTrans(int nDias) {
    return this.transacoes;
  }

  public double realizarDeposito(int deposito){
    this.saldo += deposito;
    return this.saldo;
  }

  public double realizarDeposito(double deposito){
    this.saldo += deposito;
    return this.saldo;
  }

  public double realizarDeposito(Double deposito){
    this.saldo += deposito;
    return this.saldo;
  }

  public double realizarDeposito(String deposito){
    double depositodouble = Double.parseDouble(deposito);
    this.saldo += depositodouble;
    return this.saldo;
  }

  public double realizarDeposito(ArrayList<Double> depositos){
    for (double deposito : depositos) {
      this.realizarDeposito(deposito);
    }
    
    return this.saldo;
  }

  public void imprimirDadosConta(){
    System.out.println("[Agencia]: "+this.getNumeroAgencia() + "\n[Conta]: "+this.getNumeroConta() + "\n[Saldo]: "+this.getSaldo());
  }

  public String getNumeroConta(){
    return this.numeroConta;
  }

  public String getNumeroAgencia(){
    return this.numeroAgencia;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }
}