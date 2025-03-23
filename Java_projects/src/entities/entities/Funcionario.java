package entities;

public class Funcionario {
    public String nome;
    public double salario_bruto;
    public double imposto;

    public double descontoImposto(){
        return salario_bruto - imposto;
    }

    public void aumentaSalario(double porcentagem){
        salario_bruto += salario_bruto * porcentagem / 100;
    }

    public String toString(){
        return nome + ", R$ " + String.format("%2.f", descontoImposto());
    }
}
