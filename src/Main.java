import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        try {
            System.out.println("Digite seu CEP: ");
            System.out.println("Use apenas números");
            int cep = scanner.nextInt();
            ExportaJson json = new ExportaJson();
            EnderecoViaCep endereco = consultaCep.buscaEndereco(cep);

            json.exportaJson(endereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");

        }




    }
}