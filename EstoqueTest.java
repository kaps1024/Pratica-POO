public class EstoqueTest {

    public void verificarEstoque() {

        Estoque estoque = new Estoque();

        ProdutoAlimenticio p = new ProdutoAlimenticio();

        p.setNome("Feijão");

        estoque.adicionarProduto(p);

        estoque.adicionarProduto(
            "Macarrão",
            6.5,
            10
        );

        estoque.listarProdutos();
    }
}
