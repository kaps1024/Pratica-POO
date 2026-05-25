public class ProdutoAlimenticio extends Produto {

    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(
        String dataValidade
    ) {

        this.dataValidade =
            dataValidade;
    }

    @Override
    public void exibirInfo() {

        System.out.println(
            "Produto Alimentício"
        );

        System.out.println(
            "Nome: " + getNome()
        );

        System.out.println(
            "Preço: " + getPreco()
        );

        System.out.println(
            "Quantidade: " +
            getQuantidade()
        );

        System.out.println(
            "Validade: " +
            dataValidade
        );
    }
}