import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos =
        new ArrayList<>();

    public void adicionarProduto(
        Produto produto
    ) {

        produtos.add(produto);

        System.out.println(
            "Produto adicionado."
        );
    }

    public void adicionarProduto(
        String nome,
        double preco,
        int qtd
    ) {

        ProdutoAlimenticio p =
            new ProdutoAlimenticio();

        p.setNome(nome);
        p.setPreco(preco);
        p.setQuantidade(qtd);

        produtos.add(p);

        System.out.println(
            "Produto adicionado pela sobrecarga."
        );
    }

    public void removerProduto(
        Produto produto
    ) {

        produtos.remove(produto);

        System.out.println(
            "Produto removido."
        );
    }

    public void listarProdutos() {

        System.out.println(
            "Lista de Produtos"
        );

        for (Produto p : produtos) {

            System.out.println(
                p.getNome()
            );
        }
    }
}
