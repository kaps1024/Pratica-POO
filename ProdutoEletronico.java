public class ProdutoEletronico extends Produto {

    private String voltagem;

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public void exibirInfo() {

        System.out.println("Produto Eletrônico");

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
            "Voltagem: " + voltagem
        );
    }
}