public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            System.out.println(fomatarCep("1234567"));
        }catch (CepInvalidoExceptions e){
            System.out.println("Erro: O cep n contem 8 digitos");
        }
    }
    static String fomatarCep(String cep) throws CepInvalidoExceptions {
        if (cep.length()!=8){
            throw new CepInvalidoExceptions();
        }else {
            //simulando um cep formatado
            return "23.765-064";
        }
    }
}
