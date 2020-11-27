import java.util.List;

public class ExtratoConta {
     
    public void listarTransacoes(Conta conta, int nDias) {
        List<Transacao> transacoes = conta.pesqUltTrans(nDias);
        
        for (Transacao transacao : transacoes) {
          System.out.println("Valor: "+transacao.getValor() + " - Tipo: "+transacao.getTipoTransacao());
        }
      }
}
