public class Execucao {
    public static void main (String[] args){
        Fabrica fabrica1 = new Fabrica("Firmeza","Av.Brasil","24234546","www.firmeza.com",
                "12345/0001", 150, 2, "Jorge Luiz Firmeza", "Fitas adesivas");

        System.out.println(fabrica1.getNome());
        System.out.println(fabrica1.getEndereco());
        System.out.println(fabrica1.getTelefone());
        System.out.println(fabrica1.getSite());
        System.out.println(fabrica1.getCnpj());
        System.out.println(fabrica1.getQuantidadeFuncionarios());
        System.out.println(fabrica1.getQuantidadeFiliais());
        System.out.println(fabrica1.getProprietário());
        System.out.println(fabrica1.getProduto());
    }
}
