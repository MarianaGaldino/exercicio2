public class Fabrica {
    //atributos do objeto Fabrica (o que uma fabrica tem)
    private String nome;
    private String endereco;
    private String telefone;
    private String site;
    private String cnpj;
    private int quantidadeFuncionarios;
    private int quantidadeFiliais;
    private String proprietário;
    private String produto;

    //contrutor completo com todos os atributos
    public Fabrica(String nome, String endereco, String telefone, String site, String cnpj, int quantidadeFuncionarios, int quantidadeFiliais, String proprietário, String produto) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.site = site;
        this.cnpj = cnpj;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.quantidadeFiliais = quantidadeFiliais;
        this.proprietário = proprietário;
        this.produto = produto;
    }

    //construtor vazio
    public Fabrica() {

    }

    //metodos para recuperar os atributos e/ou seta-los
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFiliais() {
        return quantidadeFiliais;
    }

    public void setQuantidadeFiliais(int quantidadeFiliais) {
        this.quantidadeFiliais = quantidadeFiliais;
    }

    public String getProprietário() {
        return proprietário;
    }

    public void setProprietário(String proprietário) {
        this.proprietário = proprietário;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
