public class ProdutoEletronicoTest {

    public void verificarProdutoEletronico() {

        ProdutoEletronico p =
            new ProdutoEletronico();

        p.setNome("Monitor");
        p.setPreco(1200);
        p.setQuantidade(2);
        p.setVoltagem("220V");

        p.exibirInfo();

        System.out.println(
            p.calcularValorEstoque()
        );
    }
}