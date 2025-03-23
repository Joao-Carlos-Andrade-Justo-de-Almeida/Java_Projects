package aplications;
import java.util.Scanner;
import java.util.Locale;

import entities.Funcionario;


public class Salario_aplicattion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario func = new Funcionario();;
        char resp;

        System.out.println("Sistema de Salários");
        do{
            System.out.print("Nome: ");
            func.nome = sc.next();
            System.out.print("Salário Bruto: ");
            func.salario_bruto = sc.nextDouble();
            System.out.print("Imposto: ");
            func.imposto = sc.nextDouble();
            System.out.println();
            System.out.print(func);
            System.out.println();
            System.out.print("Digite a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            func.aumentaSalario(porcentagem);
            System.out.println();
            System.out.println("Dados Atualizados: " + func);
            System.out.println();
            System.out.println("Deseja fazer novamente? (s/n): ");
            resp = sc.next().charAt(0);
        }while(resp != 'n');




        sc.close();
    }
}
