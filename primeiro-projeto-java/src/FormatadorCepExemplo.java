public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("0991100");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("cep inválido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8 ) {
            throw new CepInvalidoException();
        }
        return "23.754-582";
    }
}
