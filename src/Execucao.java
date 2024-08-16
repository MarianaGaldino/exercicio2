public class Execucao {
    public static void main (String[] args){
        //instanciado objeto Fabrica com construtor completo
        Fabrica fabrica1 = new Fabrica("Firmeza","Av.Brasil","24234546","www.firmeza.com",
                "12345/0001", 150, 2, "Jorge Luiz Firmeza", "Fitas adesivas");

        //imprimindo atributos do primeiro objeto Fabrica
        System.out.println(fabrica1.getNome());
        System.out.println(fabrica1.getEndereco());
        System.out.println(fabrica1.getTelefone());
        System.out.println(fabrica1.getSite());
        System.out.println(fabrica1.getCnpj());
        System.out.println(fabrica1.getQuantidadeFuncionarios());
        System.out.println(fabrica1.getQuantidadeFiliais());
        System.out.println(fabrica1.getProprietário());
        System.out.println(fabrica1.getProduto());

        //instanciando objeto Fabrica com construtor vazio
        Fabrica fabrica2 = new Fabrica();

        //setando atributos para o segundo objeto Fabrica
        fabrica2.setNome("Doce mel");
        fabrica2.setCnpj("54321/0001");
        fabrica2.setEndereco("Rua Popular");
        fabrica2.setProduto("doce de leite");
        fabrica2.setProprietário("Maria Joana");
        fabrica2.setQuantidadeFiliais(0);
        fabrica2.setQuantidadeFuncionarios(50);
        fabrica2.setTelefone("45476890");
        fabrica2.setSite("www.docemel.com");

        //imprimindo os atributos dos segundo objeto Fabrica
        System.out.println("Olá, eu trabalho na " + fabrica2.getNome() + " fica localizada na " + fabrica2.getEndereco()
               + "\n a dona é a Sra " + fabrica2.getProprietário() + ". Temos um total de " + fabrica2.getQuantidadeFuncionarios() + " funcionarios " +
               "\n voce pode entrar em contato pelo telefone " + fabrica2.getTelefone() + " ou no site " + fabrica2.getSite()
                + "\n nós fabricamos " + fabrica2.getProduto() + " e temos um total de " + fabrica2.getQuantidadeFiliais() + " filiais");
    }
}
