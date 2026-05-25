public class SaidaEstoque
    implements Movimentavel {

    private String dataSaida;

    @Override
    public void movimentar(int qtd) {

        System.out.println(
            "Saída de " +
            qtd +
            " produtos do estoque."
        );
    }
}
