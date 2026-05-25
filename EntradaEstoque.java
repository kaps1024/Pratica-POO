public class EntradaEstoque
    implements Movimentavel {

    private String dataEntrada;

    @Override
    public void movimentar(int qtd) {

        System.out.println(
            "Entrada de " +
            qtd +
            " produtos no estoque."
        );
    }
}
