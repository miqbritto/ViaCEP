public record EnderecoViaCep(String cep, String logradouro, String bairro, String localidade, String uf) {
    @Override
    public String toString() {
        return "CEP: " + cep + "\nRua: " + logradouro +
                "\nBairro: " + bairro + "\nCidade: " + localidade + "\nUF: " + uf;
    }
}
