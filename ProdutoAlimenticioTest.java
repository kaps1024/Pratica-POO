public class ProdutoAlimenticioTest {

    public void verificarProdutoAlimenticio() {

        ProdutoAlimenticio p =
            new ProdutoAlimenticio();

        p.setNome("Arroz");

        p.setPreco(25);

        p.setQuantidade(20);

        p.setDataValidade(
            "10/12/2026"
        );

        p.exibirInfo();
    }
}