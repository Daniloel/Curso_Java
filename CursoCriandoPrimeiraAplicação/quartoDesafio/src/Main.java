import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        System.out.println("Digite o CEP");

        //Não delcarei como String pois o var faz inferencia ao tipo de variavel, ou seja ele viu que ra Strin atraves do nextLine
        var cep = leitura.nextLine();

        try {
            Endereco novoendereco = consulta.buscaEndereco(cep);
            System.out.println(novoendereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.gerarArquivo(novoendereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizado o programa com falha");
        }

    }


}