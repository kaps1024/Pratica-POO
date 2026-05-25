public class Main {

    public static void main(
        String[] args
    ) {

        try {

            ServidorTeste
                .iniciarServidor();

        } catch (Exception e) {

            System.out.println(
                "Erro ao iniciar servidor."
            );
        }

        ProdutoEletronicoTest t1 =
            new ProdutoEletronicoTest();

        SmartphoneTest t2 =
            new SmartphoneTest();

        ProdutoAlimenticioTest t3 =
            new ProdutoAlimenticioTest();

        EntradaEstoqueTest t4 =
            new EntradaEstoqueTest();

        SaidaEstoqueTest t5 =
            new SaidaEstoqueTest();

        EstoqueTest t6 =
            new EstoqueTest();

        FornecedorTest t7 =
            new FornecedorTest();

        PedidoTest t8 =
            new PedidoTest();

        ItemPedidoTest t9 =
            new ItemPedidoTest();

        t1.verificarProdutoEletronico();

        t2.verificarSmartphone();

        t3.verificarProdutoAlimenticio();

        t4.verificarEntrada();

        t5.verificarSaida();

        t6.verificarEstoque();

        t7.verificarFornecedor();

        t8.verificarPedido();

        t9.verificarItemPedido();
    }
}