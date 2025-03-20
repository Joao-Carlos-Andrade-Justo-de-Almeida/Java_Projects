package sistema;
import java.util.Scanner;
import java.util.Locale;
import pessoas.Paciente;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Paciente ps;
        ps = new Paciente();
        char resp;
        String tem_convenio;

        do{
            System.out.print("Digite o seu nome: ");
            ps.nome = sc.next();
            System.out.print("Digite sua idade: ");
            ps.idade = sc.nextInt();
            System.out.print("Digite o seu peso: ");
            ps.peso = sc.nextDouble();
            System.out.print("Digite a sua altura: ");
            ps.altura = sc.nextDouble();
            System.out.print("Digite o genêro 'm' de masculino ou 'f' para feminino: ");
            ps.genero = sc.next().charAt(0);
            System.out.print("Tem convenio?. Digite 'sim' ou 'não': ");
            tem_convenio = sc.next();
            if (tem_convenio.equals("sim")) {
                System.out.print("Digite o nome do convênio: ");
                ps.convenio = sc.next();
            }else{
                System.out.println("Sem convênio registrado.");
            }
            System.out.print("Deseja cadastrar outro paciente (s/n): ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');

        sc.close();
    }
}
