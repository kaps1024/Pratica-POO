public class ItemPedido {

    private int quantidade;
    private double subtotal;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(
        int quantidade
    ) {

        this.quantidade =
            quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double calcularSubtotal() {

        subtotal = quantidade * 10;

        return subtotal;
    }
}
