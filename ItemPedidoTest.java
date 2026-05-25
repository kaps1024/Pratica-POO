public class ItemPedidoTest {

    public void verificarItemPedido() {

        ItemPedido item = new ItemPedido();

        item.setQuantidade(5);

        System.out.println(
            item.calcularSubtotal()
        );
    }
}
