import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private String nome;
    private double salario;
    private List<Conta> contas;
    //private Conta conta;

    public Cliente(String nome, double salario){
        this.nome = nome;
        this.salario =  salario;
        this.contas = new ArrayList<Conta>();
    }

    /*public void abrirConta(String numeroAgencia, String numeroConta, float saldo){
        this.contas.add(new Conta(numeroAgencia, numeroConta, saldo);  
    }*/
    
    public void abrirConta(Conta conta){
        this.contas.add(conta);  
    }

    public void realizarSaque(String codigoConta, double saque){
        for (Conta conta : contas) {
            if (codigoConta.equalsIgnoreCase(conta.getNumeroConta())) {
                conta.realizarSaque(saque);
            }
        }
    }

    public void infConta(){
        for (Conta conta: contas) {
            conta.imprimirDadosConta();
        }
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

    
