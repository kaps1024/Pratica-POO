public class Smartphone extends ProdutoEletronico {

    private String sistemaOperacional;

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(
        String sistemaOperacional
    ) {

        this.sistemaOperacional =
            sistemaOperacional;
    }

    @Override
    public void exibirInfo() {

        System.out.println(
            "Smartphone"
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
            "Sistema: " +
            sistemaOperacional
        );
    }
}