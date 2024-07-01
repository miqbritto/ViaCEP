import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ExportaJson {

    public void exportaJson(EnderecoViaCep cep) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(cep.cep() + ".json");
        escrita.write(gson.toJson(cep));
        escrita.close();
    }

}
