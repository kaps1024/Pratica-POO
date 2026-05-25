public class SmartphoneTest {

    public void verificarSmartphone() {

        Smartphone s =
            new Smartphone();

        s.setNome("Galaxy");

        s.setPreco(3500);

        s.setQuantidade(3);

        s.setSistemaOperacional(
            "Android"
        );

        s.exibirInfo();
    }
}