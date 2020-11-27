public class Transacao {
    private double valor;
    private TipoTransacao tipoTransacao;

    public Transacao() {}
    public Transacao(double valor, TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
    }
    

    public double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
   
    public TipoTransacao getTipoTransacao() {
        return this.tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public void realizarTransacao(Double valor, Conta contaOrigem, Conta contaDestino){
        contaOrigem.realizarSaque(valor);
        contaDestino.realizarDeposito(valor);
    }    
}
