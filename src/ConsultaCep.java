import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public EnderecoViaCep buscaEndereco(int cep){

        String endereco = "http://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        }  catch (Exception e){
            throw new RuntimeException("Não foi possível buscar esse CEP");
        }

        String json = response.body();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        EnderecoViaCep endereco1 = gson.fromJson(json, EnderecoViaCep.class);
        System.out.println(endereco1);
        return endereco1;
    }
}
